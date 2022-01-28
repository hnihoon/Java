package koreait.day10;

public class MyClass2 {
	//접근 권한 연습합니다.
	private int age;		//private : 다른 클래스에서 사용 못 합니다. 나(현재 클래스)만 사용한다.
	String name; 			//default : 다른 패키지에서 사용 못 합니다. 이웃이면 같이사용
	public int score; 		//public  : 어디서나 사용합니다. 공공의, 공용의
	
	//생성자 메소드 : public,default 에 따라 접근권한 설정할 수 있습니다. 기본생성자메소드(자동) 접근권한 public
//	MyClass2() {
//		
//	}
}
