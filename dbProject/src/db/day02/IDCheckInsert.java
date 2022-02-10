package db.day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import db.day01.OracleConnectUtil;

public class IDCheckInsert {

	static Connection conn = OracleConnectUtil.connect();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sql = "INSERT INTO TBL_CUSTOM# " + 
				"(CUSTOM_ID, NAME, EMAIL, AGE, REG_DATE)" + 
				"VALUES(?,?,?,?, sysdate)";
		
		System.out.println("고객을 등로갑니다. 먼저 사용할 ID 입력하고 중복확인 합니다. ");
		System.out.println("ID 입력 -> ");
		String id = sc.nextLine();
		while(true) {	//id 중복검사
			 id = sc.nextLine();
			if(idCheck(id)) {
				System.out.println("사용할 수 있는 ID 입니다.");
				break;
			} else {
				System.out.println("중복된 ID가 있습니다. 다른 ID로 해주세요.");
			}
		}
		System.out.println("등록할 ID \"" + id + "\"입니다.");
		
		System.out.print("성명 -> ");
		String name=sc.nextLine();
		System.out.print("이메일 -> ");
		String email=sc.nextLine();
		System.out.print("나이 -> ");
		int age = Integer.parseInt(sc.nextLine());
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setInt(4, age);
			pstmt.execute();
			System.out.println("고객님 환영합니다.!!");
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		
		OracleConnectUtil.close(conn);
	}

	private static boolean idCheck(String id) {
		boolean result = true;
		String sql="select * from tbl_custom#";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				if(rs.getString("CUSTOM_ID").equals(id)) {
					result = false;
				}
			}
			pstmt.close();
		} catch(SQLException e) {
			
		}
		
		return result;
	}
}
