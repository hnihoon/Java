package koreait.day06;

public class VariableTest {
	//변수가 선언되는 위치로 특성을 이해하는 연습입니다.
	//클래스의 필드는 기본형일때는 일반적으로 대문자로 표기합니다.
	//static , final(최종적인) 키워드 이해하기
	
	//static : 정적인(고정된), static 성질끼리 서로 사용 가능/
	static int gval = 34;		//클래스 소속으로 선언된 변수 , 위치로 보면 전역(global)변수
	int dval = 123;
	final int fval = 23;
	static final int fval2 = 456;		//값을 변경할 수 없는 변수
//	final int test;		//final 변수는 꼭 초기값을 저장합니다.
	
	
//	final int fval = 23;		//상수는 값을 변경할 수 없다.
	
	public static void main(String[] args) {
		
		int sum = 100;
		
		//1. while,for,if.. { } 블록 안에서 선언된 변수 : 지역변수
		//2. method { } 블록 안에서 선언된 변수 : 지역
		
		while(true) {
			int k = 12;
			System.out.println("k=" + k);
			if(k==12) break;
			System.out.println("sum=" + sum); 	//main 메소드{ } 어디에서나 사용가능
		}
		
//		System.out.println("k=" + k); 	//오류 : 선언된 {블록} 지역을 벗어남
		System.out.println("전역변수 gval=" + gval);
		
		System.out.println("final 변수 fval2=" + fval2);
//		fval2=123;		//final 변수는 값을 변경 못 합니다.
		
		//static final 예시
		System.out.println("Byte 정수의 크기 : " + Byte.BYTES);
		System.out.println("Byte 정수의 최소값 : " + Byte.MIN_VALUE);
		System.out.println("Byte 정수의 최대값 : " + Byte.MAX_VALUE);
		
		//상수 : 의미있는 값(변하지 않는 값) 들을 이름으로 표기.
		//클래스의 일반적으로 기본형 상수 필드를 대문자로 표기합니다.
	}
	
	void nonStatic(int a) {
		System.out.println("nonstatic -----");
		System.out.println("전역변수 dval =" + dval);
		System.out.println("전역변수 gval =" + gval);
		methodA(123);
		
		System.out.println(fval);
		System.out.println("-------------------");
	}
	//static -> static 만
	//nonstatic -> static, nonstatic 둘다 사용

	//3. 메소드 인자로 선언된 변수 : 해당 메소드 { } 안에서만 사용되는 지역변수
	static void methodA(int a) {
		int b = 3;		//methodA()지역변수
		System.out.println("b=" + b);
		System.out.println("전역변수 gval=" + gval);
//		nonStatic(123);		//오류
	}
	//static 에서는 -> static만
	//nonstatic -> 에서는static, nonstatic 둘다 사용, *nonstatic 은 static 키워드가 없는 것
	
	
}
