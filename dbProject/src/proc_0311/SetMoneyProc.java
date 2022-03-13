package proc_0311;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import db.day01.OracleConnectUtil;
import oracle.net.aso.e;

public class SetMoneyProc {

	public static void main(String[] args) {
		
		Connection conn = OracleConnectUtil.connect();
		String sql = "{ call proc_set_money(?,?,?,?) }";
		// 데이터베이스 프로시저 {call 프로시저이름(매개변수?)}
		
		//프로시저에서 실행할 때 필요한 매개변수 선언
		String custom_id="wonder";
		String pcode="CJ-BABQ1";
		int quantity=5;
		
		//프로시저 실행은 PreparedStatement 아니고
		CallableStatement cstmt=null;
		
		try {
			
			cstmt = conn.prepareCall(sql);
			//매개변수값 설정
			cstmt.setString(1, custom_id);
			cstmt.setString(2, pcode);
			cstmt.setInt(3, quantity);
			//4번째 매개변수는 out 임을 알려주기
			cstmt.registerOutParameter(4, Types.VARCHAR);
			// 정수/실수 일때는 Types.Numeric , 날짜 Types.Date
			cstmt.executeUpdate();		//프로시저 실행.
			// 실행 후 프로시저 출력 매개변수 가져와서 print
			System.out.println("실행 결과 : " + cstmt.getString(4));
			
			cstmt.close();
		}catch(SQLException e) {
			System.out.println("실행 오류 : " + e.getMessage());
		} finally {
			OracleConnectUtil.close(conn);
		}
	}

}
