package db.day03;

import db.vo.Product;

public class Q1 {

	public static void main(String[] args) {
		Product dongwun = ProductDao.selectOne("B1");
		System.out.println(dongwun);
		
		
	}
}

