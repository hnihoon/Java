package koreait.day06;

import java.util.Scanner;

public class MethodTest {
	//클래스(또는 객체) 의 구성 : 필드, 메소드
	//-> 메소드를 이해하는 연습입니다. 단, 같은 클래스에서 사용되는 경우입니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(); // System은 클래스, out은(객체형)필드, println은 out의 메소드
		
		//메소드 실행 - 메소드 이름 호출합니다.
		testMethod1();	//main 메소드의 특징 : static , 실행 할 수 있는 메소드는 static 만 가능합니다.
		testMethod1();  //-> static 은 static 성질을 갖는 요소들만 사용합니다.
//		testMethod2(123, 123);  //오류-> 두번째 인자의 형식이 틀림
		testMethod2(123, "twice"); 
		testMethod22(1.34,23,4.56);
		int result = testMethod3();		//반환값(리턴값)이 있는 메소드는 변수를 사용하여 저장 또는 출력을 합니다.
		System.out.println(result);
		System.out.println("testMethod3 return = " + testMethod3()); //리턴값연산
		System.out.println(testMethod33());		//수요일 출력
		
		System.out.println("testMethod4 return = " + testMEthod4(34, 67));
		// testMethod44를 실행해서 리턴값을 변수 d_result 에 저장하고 출력하세요
		double d_result = testMethod44(1.1, 3);
		System.out.println("testMeth1od44 return = " + d_result);
		int w = sc.nextInt();
		System.out.print("오늘은 -> ");
		System.out.println(dayOfWeek(w));
	}
	
	
	//1.인자(args), 반환값이 없는(void) 메소드 입니다.
	static void testMethod1() {	//메소드 정의 연습1 	//메소드와 함수는 성격이 유사합니다.
		System.out.println("첫번째 메소드 정의 연습입니다.");
	}
	
	//2. 인자가 있고, 반환값이 없는 메소드 입니다.
	//인자 개수는 제한이 없습니다. 변수 선언과 같은 방식으로 ,로구분합니다. 인자는 메소드 실행에 필요한 데이터입니다.
	static void testMethod2(int a, String name) { 	//인자 2개
		//메소드를 실행할 때는 정수,문자열 순서에 맞게 값을 지정하고
		//그 값을 a는 정수값, name 은 문자열의 참조값을 저장합니다.
		System.out.println("정수값=" + a);
		System.out.println("문자열=" + name);
	}
	static void testMethod22(double a, int b , double c) {
		System.out.println("인자값 합계 = " + (a+b+c));
	}
	//3. 인자 없고, 반환값이 있는 메소드 입니다.
	static int testMethod3() {
		return 145;		//반환값이 있는 형식에서는 꼭 있어야하는 명령어 -> return
		
	}
	
	static String testMethod33() {
		return "수요일";		//반환값이 있는 형식에서는 꼭 있어야하는 명령어 -> return
				
	}
	
	//4.인자 있고, 반환값이 있는 메소드
	static int testMEthod4(int a, int b) {
		return(a+b);
	}
	
	static double testMethod44(double a, int b) {
		double result = a+b;
		return result;
	}
	
	// 정수값을 전달 받습니다. 1이면 월요일, 2이면 화요일, 3이면 수요일... 7이면 일요일을 리턴하는 메소드
	static String dayOfWeek(int w) {
		String wek = "unknown";
		switch(w) {
		case 1:
			wek = "월요일 입니다.";
			break;
		case 2:
			wek = "화요일 입니다.";
			break;
		case 3:
			wek = "수요일 입니다.";
			break;
		case 4:
			wek = "목요일 입니다.";
			break;
		case 5:
			wek = "금요일 입니다.";
			break;
		case 6:
			wek = "토요일 입니다.";
			break;
		case 7:
			wek = "일요일 입니다.";
			break;
		}
		return wek;
		
	}
	
	
	
	
	
}
