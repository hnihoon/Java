package db.day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.day01.OracleConnectUtil;
import db.vo.Custom;

public class CustomDao {

	// 필드값이 없는 클래스 입니다. -> new 연산으로 객체를 생성했을때 서로 다른 필드값을 갖는 것이 없습니다.
	// -> static 키워드로 실행 가능한 메소드 입니다. static 은 메모리의 공유영역입니다.
	// -> jdbc에서 dao 클래스는 static으로 하지 않습니다. -> 싱글턴(singleton) 객체로 사용합니다.
	
	private static CustomDao customDao = new CustomDao();
	private CustomDao() {}
	private static CustomDao getCustomDao() {
		return customDao;
	}
	
	//intsert 쿼리
	public void insert(Custom vo) {
		Connection conn = OracleConnectUtil.connect();
		String sql = "INSERT INTO TBL_CUSTOM# " + 
				"(CUSTOM_ID, NAME, EMAIL, AGE, REG_DATE)" + 
//				"VALUES('sana', '최사나', 'unknown', 22, sysdate)"; //항상 동일한 값. -> 변경이 필요합니다.
				"VALUES(?,?,?,?, sysdate)"; //값 부분에 ? -> 해당값은 execute전에 대입
				
//		String id=sc.nextLine();
//		String name=sc.nextLine();
//		String email=sc.nextLine();
//		int age = Integer.parseInt(sc.nextLine());
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getCustom_id());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getEmail());
//			pstmt.setNString(parameterIndex, value);  //오라클데이터 타입이 NVARCHAR2, NCHAR일때
			pstmt.setInt(4, vo.getAge());
			
			pstmt.execute();	//sql 실행 메소드
			System.out.println("고객 1건이 새로 등록되었습니다.!!");
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		
	}
	//update 쿼리
//		public void update(String custom_id, String email) {  //방법1)
		public void update(Custom vo) {  //방법2)
		Connection conn = OracleConnectUtil.connect();
		String sql = "UPDATE TBL_custom# SET email =? WHERE custom_id=?";
		PreparedStatement pstmt = null;
		String custom_id = null;
		String email = null;
		try {
			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, email);		//방법1
//			pstmt.setString(2, custom_id);	//방법1
			
			//방법2) 수정할 컬럼이 많을때 매개변수를 모두 나열하는 것은 비효율적이므로 객체로 받아옵니다.
			pstmt.setString(1, vo.getEmail());		//방법2
			pstmt.setString(2, vo.getCustom_id());	//방법2
			
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
	}
		System.out.println("정상적으로 email이 변경 되었습니다.");
		OracleConnectUtil.close(conn);
	}
	//delete 쿼리
	public void delete(String custom_id) {
		//custom_id 는 이 메소드를 호출할 때 값이 전달됩니다.
		Connection conn = OracleConnectUtil.connect();
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM TBL_CUSTOM# WHERE CUSTOM_ID=?";
		//String custom_id = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, custom_id);
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		System.out.println("정상적으로 회원 탈퇴되었습니다.");
		OracleConnectUtil.close(conn);
	}
	//select 쿼리 (기본키 컬럼으로 조회하고 결과 반환)
	public static Custom selectOne(String custom_id) {
		Connection conn = OracleConnectUtil.connect();
		PreparedStatement pstmt = null;
		String sql = "select * from tbl_custom where custom_id = ?";
		//기본키컬럼 조회결과는 0또는 1개 행입니다.
		ResultSet rs = null;
		Custom vo = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, custom_id);
			rs = pstmt.executeQuery(); 	
			if(rs.next()) {		//조회결과 1개 행 있으면
				vo = new Custom();
				vo.setCustom_id(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setEmail(rs.getString(3));
				vo.setAge(rs.getInt(4));
				vo.setReg_date(rs.getDate(5));
			}	//없으면 (else) null 반환
			
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		
		OracleConnectUtil.close(conn);
		return vo;
	}
	
	//select 쿼리(조건없음)
	public List<Custom> selectAll() {
		Connection conn = OracleConnectUtil.connect();
		String sql = "select * from tbl_custom#";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Custom> customs = new ArrayList<>();

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); 	
			
			while(rs.next()) {
				customs.add(new Custom(rs.getString(1),
						rs.getString(2), 
						rs.getString(3), 
						rs.getInt(4), 
						rs.getDate(5)));
				
			}
			
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		
		OracleConnectUtil.close(conn);
		return customs;
	} //메소드 끝
	
}
