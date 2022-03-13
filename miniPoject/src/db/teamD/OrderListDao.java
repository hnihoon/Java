package db.teamD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class OrderListDao {

	private static OrderListDao orderListDao = new OrderListDao();

	private OrderListDao() {
	}

	public static OrderListDao getOrderListDao() {
		return orderListDao;
	}
	
	//고객 1명 주문내역 실행하는  코드   OrderList VO 에서 toString 에 메뉴, 수량, 가격만 출력하도록 만듦
	public List<OrderList> selectOrderList(int custom_num) {
		List<OrderList> list = new ArrayList<>();
		Connection conn = CafeConnectUtil.connect();
		PreparedStatement pstmt = null;
		String sql="SELECT * FROM V_ORDERLIST WHERE CUSTOM_NUM=?";
		ResultSet rs = null;
				
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custom_num);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				list.add(new OrderList(rs.getInt(1),
										rs.getString(2),
										rs.getInt(3),
										rs.getInt(4),
										rs.getString(5)));
//			System.out.println(String.format("%-13s", rs.getString(2))+"\t"
//							+String.format("%5s", rs.getInt(4))
//							+String.format("%7s", rs.getInt(3))
//							+String.format("%13s", (rs.getInt(3)*rs.getInt(4))));
//			System.out.println(rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
//			System.out.println(String.format("%-15s", rs.getString(2))+"\t"
//						+rs.getInt(3)+"\t"+rs.getInt(4)+"\t"+(rs.getInt(3)*rs.getInt(4)));
			}
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류: "+e.getMessage());
		}
		CafeConnectUtil.close(conn);
		return list;
	}

//	public List<OrderList> selectPrice(int custom_num) {
//		List<OrderList> list = new ArrayList<>();
//		Connection conn = CafeConnectUtil.connect();
//		PreparedStatement pstmt = null;
//		String sql="SELECT * FROM V_ORDERLIST WHERE CUSTOM_NUM=?";
//		ResultSet rs = null;
////		int price =0;		
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, custom_num);
//			rs=pstmt.executeQuery();
//			while(rs.next()) {
//				list.add(new OrderList(rs.getInt(1),
//										rs.getString(2),
//										rs.getInt(3),
//										rs.getInt(4),
//										rs.getString(5)));
////			System.out.println(String.format("%-15s", rs.getString(2))+"\t"
////							+String.format("%5s", rs.getInt(3))
////							+String.format("%15s", (rs.getInt(3)*rs.getInt(4))));
////			price += rs.getInt(3)*rs.getInt(4);
////			System.out.println(rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
////			System.out.println(String.format("%-15s", rs.getString(2))+"\t"
////						+rs.getInt(3)+"\t"+rs.getInt(4)+"\t"+(rs.getInt(3)*rs.getInt(4)));
//			}
////			System.out.println(String.format("%-50s", "결제 금액")+String.format("%17d", price));
////			System.out.println();
//			pstmt.close();
//		} catch (SQLException e) {
//			System.out.println("SQL 실행 오류: "+e.getMessage());
//		}
//		CafeConnectUtil.close(conn);
//		return list;
//	}	
	
	
}
