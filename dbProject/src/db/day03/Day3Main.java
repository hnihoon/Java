package db.day03;

import db.vo.Custom;

public class Day3Main {

	public static void main(String[] args) {
		Custom momo = CustomDao.selectOne("twice");
		System.out.println(momo);
		
		SingletonObj obj = SingletonObj.getInstance();
		obj.print();
		
		SingletonObj obj2 = SingletonObj.getInstance();
		System.out.println(obj==obj2);
	}

}
