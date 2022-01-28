package koreait.day03;

import java.util.Scanner;
// -----연습문제------
//[[성적 집계 : 평균과 총점 구하기]]
//성적 입력하세요
//국어 -> ... (입력)
//영어 -> ... (입력)
//과학 -> ... (입력)
//
//>>처리되었습니다.
//총점 : ...
//평균 84 (84.23)
//----------------------------
//참고 : 총점 = 국어+영어+과학 , 평균 총점 / 3 (주의 : 정수타입 / 정수타입의 결과는 정수 입니다.)
//			평균은 정수값 출력 and 소수점이하 2자리 출력
//변수명 : korean, english, science , sum 4개만 사용해서 하세요.

public class JumsuTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("[[성적 집계 : 평균과 총점 구하기]]");
		System.out.println("성적 입력하세요.");
		// 국어 정수값 입력
		System.out.print("국어 -> ");
		int korean = sc.nextInt();
		// 영어 정수값 입력
		System.out.print("영어 -> ");
		int english = sc.nextInt();
		// 과학 정수값 입력
		System.out.print("과학 -> ");
		int science = sc.nextInt();
		// 합계
		int sum = korean + english + science;
		
		System.out.println("\n>>처리되었습니다.");
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %d (%.2f)",sum/3,(double)sum/3);
		
		sc.close();
	}

}
