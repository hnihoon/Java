package koreait.day03;

import java.util.Scanner;

public class IfTest {	//boolean 자료형과 관계연산을 이용한 조건제어 연습합니다.

	public static void main(String[] args) {
		// if문의 형식1 : if(조건관계식) {...A} else {...B}
		// 	A는 조건관계식이 참일때 실행되는 명령문
		//  B는 조건관계식이 거짓일때 실행되는 명령문
		// A,B 명령문이 1개일 때는 {} 생략이 가능합니다.
		
		//응용 : point 100점 이상이면 회원등급 VIP , 100점 미만이면 일반회원 출력
		
		int point;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("포인트 입력하세요. ->");
		point = sc.nextInt();
		
		//if를 이용합시다.
		System.out.print("회원등급 : ");
		if(point >=100)
			System.out.println("VIP");
		else
			System.out.println("일반회원");
		
		//point가 70이상이면 +100을 추가 적립, 70미만이면 +110을 추가적립
		//point가 70이상이면 감사합니다, 70미만이면 +110을 추가적립
	
		if(point >= 70) {
//			point = point + 100;
			point += 100;
			System.out.println("🎁감사합니다");
		} else {		
//			point = point + 110;
			point += 110;
			System.out.println("👍또 오세요");
		}
		
		System.out.println("현재 포인트 : " + point);
	}

}
