package koreait.day01;	//koreait.day1은 패키지 이름

import java.util.ArrayList;
import java.util.List;

public class PrintTest {	//PrintTest는 클래스 이름
//설명:주석(comment)

	public static void main(String[] args) {
		// day1 첫번째 연습 : 출력하기
		
		System.out.println("Hello world");
		//syso 입력후 Ctrl + 스페이스바로 자동완성 하세요.
		System.out.println("----------------------");
		System.out.println("End!");
		System.out.println();
		int i = 1;
		
		short b_val;
		int i_val = 87;
		long l_val;
		char ch1 = 's';
		double d_val=7.345;
		
		l_val = 234;
		b_val=23;
		i_val = ch1;
		d_val = i_val;
//		i_val = d_val;
		
		String aa = "";
		String ss = "SS";
		
		System.out.println(aa.equals(""));
	}
}

//저장 : Ctrl + S , 실행 : Ctrl + f11, 한줄 복사 : Ctrl+Alt+아래방향키
/* 자바는 클래스를 이용하는 프로그래밍 방식이다.
예) 구스 다운을 사고 싶다 -> K2 매장, 치킨을 먹고싶다 -> bhc
커피를 마시고 싶다 -> 스타벅스

 클래스는 콘솔에 출력하고 싶다 -> System클래스 사용(출력과 입력기능)\
 주어진 문장에서 korea 단어 검색하고 싶다. args -> String클래스 사용(찾기 기능)
 
 현실에서 사용할 프로그램은 요구사항 -> 프로그램 개발 -> 적절한 java 클래스를 사용
 */

