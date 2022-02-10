package db.day01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest3 {	
// ResultSet 타입 쿼리 결과를 모두 출력하기 : rs.next() 반복조건으로 이용하여

	public static void main(String[] args) {
		
		Connection conn = OracleConnectUtil.connect();
		String sql="select * from tbl_custom#";
		PreparedStatement pstmt = null;
		
		//select 쿼리는 결과를 저장해야합니다.
		ResultSet rs = null; 	// 쿼리 반환결과 테이블의 데이터를 참조합니다. 반환결과는 행단위로 접근합니다.
		//insert , update, delete 는 쿼리 실행한 반환 결과데이터가 없습니다.
		
		try {
			pstmt = conn.prepareStatement(sql);
//			pstmt.execute();		//insert,update,delete
			rs = pstmt.executeQuery(); 	//select
			
			int i = 1;
			//결과 확인하기
			while(rs.next()) {
				System.out.print(i++ + "행 데이터 보기 ");
				System.out.print(String.format("%-20s", rs.getString("custom_id")));
				System.out.print(String.format("%-20s", rs.getString("name")));
				System.out.print(String.format("%-20s", rs.getString("email")));
				System.out.print(String.format("%5d", rs.getInt("age")));
//				System.out.print("CUSTOM_ID\t" + rs.getString("custom_id") + "\t");
//				System.out.print("NAME\t" + rs.getString("name") + "\t");
//				System.out.print("EMAIL\t" + rs.getString("email") + "\t");
//				System.out.print("AGE\t" + rs.getInt("age") + "\t");
				System.out.println(String.format("%20s",rs.getTimestamp("reg_date")));
			}
			pstmt.close();
			
			
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		
		OracleConnectUtil.close(conn);
		
		
	}

}
