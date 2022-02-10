package db.day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import db.day01.OracleConnectUtil;
import db.vo.Custom;

public class VOClassTest {

	public static void main(String[] args) {
		Connection conn = OracleConnectUtil.connect();
		String sql = "select * from tbl_custom#";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Custom> customs = new ArrayList<>();
		

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); 	//select
			
			while(rs.next()) {
				//select 조회 결과를 한행씩 가져와서 List 에 추가합니다.
				// getXXX(인덱스) : 인덱스는 select 뒤에 나열된 컬럼의 순서입니다.
				customs.add(new Custom(rs.getString(1),
						rs.getString(2), 
						rs.getString(3), 
						rs.getInt(4), 
						rs.getDate(5)));
			/*
				System.out.print(String.format("%-20s", rs.getString("custom_id")));
				System.out.print(String.format("%-20s", rs.getString("name")));
				System.out.print(String.format("%-20s", rs.getString("email")));
				System.out.print(String.format("%5d   ", rs.getInt("age")));
				System.out.println(rs.getTimestamp("reg_date"));
			*/
			}
			System.out.println("List 에 저장된 값 확인 -----------------");
			System.out.println(customs);
			System.out.println("List 의 데이터를 1개씩 출력 --------------");
			for(int i=0; i<customs.size(); i++) {
				System.out.println(String.format("i: %-3s", i+1));
				System.out.println(customs.get(i));
			}
			
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		
		OracleConnectUtil.close(conn);
		
		
	}
		
	}

