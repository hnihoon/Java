package teamD.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CustomDao {

	private static CustomDao customDao = new CustomDao();
	private CustomDao() {}
	public static CustomDao getCustomDao() {
		return customDao;
	}
	
//insert
	public void insert(Custom vo) {
		Connection conn = CafeConnectUtil.connect();
		String sql = "INSERT INTO TBL_CUSTOM(custom_num,p_or_s) "
				+ "VALUES (?,?)";
		PreparedStatement pstmt = null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setInt(1, vo.getCustom_num());
			pstmt.setString(2, vo.getP_or_s());
			
			pstmt.execute();
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류"+e.getMessage());
		}
		CafeConnectUtil.close(conn);
		
		
	}
	
//update
	public void update(Custom vo) {
		Connection conn = CafeConnectUtil.connect();
		String sql = "UPDATE TBL_CUSTOM SET P_OR_S=? WHERE CUSTOM_NUM=?";
		PreparedStatement pstmt = null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getP_or_s());
			pstmt.setInt(2, vo.getCustom_num());
			
			pstmt.execute();
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류"+e.getMessage());
		}
		CafeConnectUtil.close(conn);
	}
//update
//	public void updateC(String p_or_s) {
//		Connection conn = CafeConnectUtil.connect();
//		String sql = "UPDATE TBL_CUSTOM SET P_OR_S=? WHERE CUSTOM_NUM="
//				+ "(SELECT MAX(CUSTOM_NUM) FROM TBL_CUSTOM)";
//		PreparedStatement pstmt = null;
//		
//		try {
//			pstmt=conn.prepareStatement(sql);
//			
//			pstmt.setString(1, p_or_s);
//			
//			pstmt.execute();
//			pstmt.close();
//			
//		} catch (SQLException e) {
//			System.out.println("SQL 실행 오류"+e.getMessage());
//		}
//		CafeConnectUtil.close(conn);
//	}	
//delete
	public void delete(int custom_num) {
		Connection conn = CafeConnectUtil.connect();
		String sql = "DELETE FROM TBL_CUSTOM WHERE CUSTOM_NUM=?";
		PreparedStatement pstmt = null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setInt(1, custom_num);
			
			pstmt.execute();
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류"+e.getMessage());
		}
		CafeConnectUtil.close(conn);
	}
//전체 select	
	public List<Custom> selectAll() {
		Connection conn = CafeConnectUtil.connect();
		String sql = "SELECT * FROM TBL_CUSTOM";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Custom> customs = new ArrayList<>();
		try {
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				customs.add(new Custom(rs.getInt(1)
									,rs.getString(2)));
			}
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류"+e.getMessage());
		}
		CafeConnectUtil.close(conn);
		return customs;
	}
//1개 행 select 
	public Custom selectOne(int custom_num) {
		Connection conn = CafeConnectUtil.connect();
		String sql = "SELECT * FROM TBL_CUSTOM WHERE CUSTOM_NUM = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Custom vo = null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, custom_num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo=new Custom(rs.getInt(1)
									,rs.getString(2));
			}
//			System.out.println("주문 번호 : "+rs.getInt(1));
//			System.out.println("주문 옵션 : "+rs.getString(2));
//			System.out.println();
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류"+e.getMessage());
		}
		CafeConnectUtil.close(conn);
		return vo;
	}

	public int selectNum() {
		Connection conn = CafeConnectUtil.connect();
		String sql = "SELECT MAX(CUSTOM_NUM) FROM TBL_CUSTOM";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int max=0;
		try {
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				max=rs.getInt(1);
			}
			pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류"+e.getMessage());
		}
		CafeConnectUtil.close(conn);
		return max;
	}
	
	
}
