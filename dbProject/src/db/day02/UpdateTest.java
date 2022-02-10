package db.day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import db.day01.OracleConnectUtil;

public class UpdateTest {
	
	static Connection conn = OracleConnectUtil.connect();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sql = "UPDATE TBL_custom# SET email =? WHERE custom_id=?";
		PreparedStatement pstmt = null;
		String custom_id = null;
		while(true) {	//id 중복검사
			System.out.println("ID 입력 -> ");
			custom_id = sc.nextLine();
			if(!idCheck(custom_id)) {
				System.out.println("사용할 수 있는 ID 입니다.");
				break;
			} else {
				System.out.println("중복된 ID가 있습니다. 다른 ID로 해주세요.");
			}
		}
		System.out.print("원하시는 email을 입력하세요. -> ");
		String email = sc.nextLine();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, custom_id);

			pstmt.execute();
			pstmt.close();

		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		System.out.println("정상적으로 email이 변경 되었습니다.");
		OracleConnectUtil.close(conn);
		sc.close();
	}
	
	
	private static boolean idCheck(String id) {
		boolean result = false;
		ResultSet rs = null;
		String sql="select * from tbl_custom# where custom_id=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(!rs.next()) result = true;
			
			pstmt.close();
		} catch(SQLException e) {
			System.out.println("SQL 실행 오류" + e.getMessage());
		}
		return result;
	}

}
