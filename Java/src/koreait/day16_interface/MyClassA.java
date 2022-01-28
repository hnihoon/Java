package koreait.day16_interface;

public class MyClassA implements InterfaceA{

	//InterfaceA에 선언된 추상 메소드를 구현하는 것이 핵심입니다.
	
	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("MyClassA - methodA 실행");
	}
	
	@Override
	public int methodB(int num) {
		// TODO Auto-generated method stub
		System.out.println("MyClassA - methodB 실행(arg: " + num + ")");
		return num+10;
	}
}
