package db.teamD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class OrderDao {

	private static OrderDao orderDao = new OrderDao();

	private OrderDao() {
	}

	public static OrderDao getOrderDao() {
		return orderDao;
	}

//insert
	public void insert(Order vo) {
		Connection conn = CafeConnectUtil.connect();
		String sql = "INSERT INTO TBL_ORDER" + "(order_num,custom_num,prod_name,quantity,buy_date) "
				+ "VALUES (buy_seq.nextval,?,?,?,sysdate)";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, vo.getCustom_num());
			pstmt.setString(2, vo.getProd_name());
			pstmt.setInt(3, vo.getQuantity());

			pstmt.execute();
			pstmt.close();

		} catch (SQLException e) {
			System.out.println("SQL 실행 오류" + e.getMessage());
		}
		CafeConnectUtil.close(conn);
	}

//update
	public void update(Order vo) {
		Connection conn = CafeConnectUtil.connect();
		String sql = "UPDATE TBL_ORDER SET QUANTITY=? " + "WHERE ORDER_NUM,=?";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, vo.getQuantity());
			pstmt.setInt(2, vo.getCustom_num());
			pstmt.setString(3, vo.getProd_name());

			pstmt.execute();
			pstmt.close();

		} catch (SQLException e) {
			System.out.println("SQL 실행 오류" + e.getMessage());
		}
		CafeConnectUtil.close(conn);
	}

//delete
	public void delete(int order_num) {
		Connection conn = CafeConnectUtil.connect();
		String sql = "DELETE FROM TBL_ORDER WHERE ORDER_NUM=?";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, order_num);

			pstmt.execute();
			pstmt.close();

		} catch (SQLException e) {
			System.out.println("SQL 실행 오류" + e.getMessage());
		}
		CafeConnectUtil.close(conn);
	}

//전체 select	
	public List<Order> selectAll() {
		Connection conn = CafeConnectUtil.connect();
		String sql = "SELECT * FROM TBL_ORDER";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Order> orders = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				orders.add(new Order(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getTimestamp(5)));
			}
			pstmt.close();

		} catch (SQLException e) {
			System.out.println("SQL 실행 오류" + e.getMessage());
		}
		CafeConnectUtil.close(conn);
		return orders;
	}

	// 1개 주문번호 select
	public Order selectOne(int order_num) {
		Connection conn = CafeConnectUtil.connect();
		String sql = "SELECT * FROM TBL_ORDER WHERE ORDER_NUM = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Order vo = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, order_num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				vo = new Order(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getTimestamp(5));
			}
			pstmt.close();

		} catch (SQLException e) {
			System.out.println("SQL 실행 오류" + e.getMessage());
		}
		CafeConnectUtil.close(conn);
		return vo;
	}

}
