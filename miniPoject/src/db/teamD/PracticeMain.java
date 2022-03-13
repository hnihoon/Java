package db.teamD;

import java.util.List;

public class PracticeMain {

	public static void main(String[] args) {
		ProductDao pd = ProductDao.getProductDao();
		
		Product productOne = pd.selectOne("아메리카노");
		System.out.println(productOne);
		System.out.println(productOne.getPrice());
//		
//		List<Product> productAll = pd.selectAll();
//		for(Product vo : productAll) 
//			System.out.println(vo);
//
//		OrderDao od = OrderDao.getOrderDao();
//		
//		Order orderOne = od.selectOne(3);
//		System.out.println(orderOne);
//		
//		List<Order> orderAll = od.selectAll();
//		for(Order vo : orderAll) 
//			System.out.println(vo);
		
//		CustomDao cd = CustomDao.getCustomDao();
//		OrderListDao odl = OrderListDao.getOrderListDao();
//		
////1번 고객 주문서 출력- 메뉴 고르는 화면		
//		System.out.println(String.format("%-20s", "메뉴")+"\t"
//					+String.format("%5s", "단가")+"\t"
//				+String.format("%7s", "수량")+"\t"+String.format("%15s", "금액"));
//		odl.selectOrderList(1);
//		odl.selectPrice(1);
//		
////2번 고객 주문서 출력- 메뉴 고르는 화면				
//		System.out.println(String.format("%-20s", "메뉴")+"\t"
//				+String.format("%5s", "단가")+"\t"
//			+String.format("%7s", "수량")+"\t"+String.format("%15s", "금액"));
//		odl.selectOrderList(2);
//		odl.selectPrice(2);
//
//// 결제 완료 후 주문서 출력
//		cd.selectCustom(1);
//		System.out.println(String.format("%-20s", "메뉴")+"\t"
//				+String.format("%5s", "단가")+"\t"
//			+String.format("%7s", "수량")+"\t"+String.format("%15s", "금액"));
//		odl.selectOrderList(1);
//		odl.selectPrice(1);
//		
//		cd.selectCustom(3);	
//		cd.updateC("S");
//		cd.selectCustom(3);
	}

}
