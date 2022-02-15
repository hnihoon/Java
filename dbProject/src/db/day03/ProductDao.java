package db.day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.day01.OracleConnectUtil;
import db.vo.Custom;
import db.vo.Product;

public class ProductDao {

	private static final List<Product> Product = null;
	private static ProductDao productdao = new ProductDao();
	
	private ProductDao() {
		
	}
	
	public static ProductDao getProcutDao() {
		return productdao;
	}
	
		public void insert(Product pdt) {
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
	
 		public void update(Product pdt) { 
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
	
		public List<Product> selectAll() {
			Connection conn = OracleConnectUtil.connect();
			String sql = "select * from tbl_custom#";
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			List<Product> pdt = new ArrayList<>();

			try {
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery(); 	
				
				while(rs.next()) {
					pdt.add(new Product
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
			return Product;
	}	//selectAll 메소드 끝
	
		public static Product selectOne(String category) {
			Connection conn = OracleConnectUtil.connect();
			PreparedStatement pstmt = null;
			String sql = "select * from tbl_product# where category= ?";
			ResultSet rs = null;
			Product vo = null;
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, category);
				rs = pstmt.executeQuery(); 	
				if(rs.next()) {		
					vo = new Product();
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
