package db.day01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {	//가장 기초적인 jdbc 코드입니다.

	public static void main(String[] args) {
		
		Connection conn = OracleConnectUtil.connect();
		String sql="select * from tbl_custom#";
		PreparedStatement pstmt = null;
		
		//**select 쿼리는 결과를 저장해야합니다.
		ResultSet rs = null; 	// 쿼리 반환결과 즉 테이블의 데이터를 참조합니다. 반환결과는 행단위로 접근합니다.
		//insert , update, delete 는 쿼리 실행한 반환 결과데이터가 없습니다.
		
		try {
			pstmt = conn.prepareStatement(sql);
//			pstmt.execute();		//insert,update,delete
			rs = pstmt.executeQuery(); 	//select
			
			//결과 확인하기
			System.out.println("조회 결과 있습니까?" + rs.next());
			System.out.println("행 데이터 보기 --------------------");
			System.out.println(rs.getString("custom_id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("email"));
			System.out.println(rs.getInt("age"));
			System.out.println(rs.getDate("reg_date"));
			System.out.println(rs.getTimestamp("reg_date"));
			
			System.out.println("조회 결과 있습니까?" + rs.next());
			System.out.println("조회 결과 있습니까?" + rs.next());
			System.out.println("조회 결과 있습니까?" + rs.next());
			System.out.println("조회 결과 있습니까?" + rs.next());
			System.out.println("조회 결과 있습니까?" + rs.next());
			System.out.println("조회 결과 있습니까?" + rs.next());
			System.out.println("조회 결과 있습니까?" + rs.next());
			System.out.println("조회 결과 있습니까?" + rs.next());
			
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		
		OracleConnectUtil.close(conn);
		
		
	}

}
