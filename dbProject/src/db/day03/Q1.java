package db.day03;

import db.vo.Product1;

public class Q1 {

	public static void main(String[] args) {
		Product1 dongwun = ProductDao.selectOne("B1");
		System.out.println(dongwun);
		
		
	}
}

