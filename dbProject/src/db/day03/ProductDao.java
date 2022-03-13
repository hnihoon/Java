package db.day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.day01.OracleConnectUtil;
import db.vo.Custom;
import db.vo.Product1;

public class ProductDao {

	private static final List<Product1> Product1 = null;
	private static ProductDao productdao = new ProductDao();
	
	private ProductDao() {
		
	}
	
	public static ProductDao getProcutDao() {
		return productdao;
	}
	
		public void insert(Product1 pdt) {
			Connection conn = OracleConnectUtil.connect();
			String sql = "INSERT INTO TBL_CUSTOM# " + 
					"(pcode, category, pname, price )" + 
					"VALUES(?,?,?,?, sysdate)"; 
					
			try {
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, pdt.getPcode());
				pstmt.setString(2, pdt.getCategory());
				pstmt.setString(3, pdt.getPname());
				pstmt.setInt(4, pdt.getPrice());
				
				pstmt.execute();	
				System.out.println("고객 1건이 새로 등록되었습니다.!!");
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("SQL 실행 오류 : " + e.getMessage());
			}
			
		}  //insert 메소드 끝
	
 		public void update(Product1 pdt) { 
			Connection conn = OracleConnectUtil.connect();
			String sql = "UPDATE TBL_product# SET category =? , pname =? , price =? WHERE pcode=?";
			PreparedStatement pstmt = null;
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, pdt.getPcode());		
				pstmt.setString(2, pdt.getCategory());	
				pstmt.setString(3, pdt.getPname());
				pstmt.setInt(4, pdt.getPrice());
				
				pstmt.execute();
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
			OracleConnectUtil.close(conn);
		}  //update 메소드 끝
	
	public void delete(String pcode) {
		Connection conn = OracleConnectUtil.connect();
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM TBL_PRODUCT# WHERE pcode=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pcode);
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}
		System.out.println("정상적으로 회원 탈퇴되었습니다.");
		OracleConnectUtil.close(conn);
	}  //delete 메소드 끝
	
		public List<Product1> selectAll() {
			Connection conn = OracleConnectUtil.connect();
			String sql = "select * from tbl_custom#";
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			List<Product1> pdt = new ArrayList<>();

			try {
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery(); 	
				
				while(rs.next()) {
					pdt.add(new Product1
						   (rs.getString(1),
							rs.getString(2), 
							rs.getString(3), 
							rs.getInt(4)));
				}
				
				pstmt.close();
				
			} catch (SQLException e) {
				System.out.println("SQL 실행 오류 : " + e.getMessage());
			}
			
			OracleConnectUtil.close(conn);
			return Product1;
	}	//selectAll 메소드 끝
	
		public static Product1 selectOne(String category) {
			Connection conn = OracleConnectUtil.connect();
			PreparedStatement pstmt = null;
			String sql = "select * from tbl_product# where category= ?";
			ResultSet rs = null;
			Product1 vo = null;
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, category);
				rs = pstmt.executeQuery(); 	
				if(rs.next()) {		
					vo = new Product1();
					vo.setPcode(rs.getString(1));
					vo.setCategory(rs.getString(2));
					vo.setPname(rs.getString(3));
					vo.setPrice(rs.getInt(4));
				}	
				
			} catch (SQLException e) {
				System.out.println("SQL 실행 오류 : " + e.getMessage());
			}
			
			OracleConnectUtil.close(conn);
			return vo;
		}  //selectOne 메소드 끝
		
	}
