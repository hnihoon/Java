package koreait.day05;

import java.util.Scanner;

public class MathExam {
	//작성자 : 김동훈 (2022/01/04)
	
//		[[수학 공부 도우미]]
//			
//			1. 덧셈       2. 뺄셈    3. 곱셈      4. 종료
//			
//			연산을 선택하세요. ->  ..1..
//			✏️  값 1 을 입력하세요. ->  ..34..
//			✏️  값 2 을 입력하세요. ->  ..23..
//			정답  : 34 + 23 = 57 입니다.
//			
//			연산을 선택하세요. ->  ..2..
//			✏️  값 1 을 입력하세요. ->  ..71..
//			✏️  값 2 을 입력하세요. ->  ..23..
//			정답  : 71 - 23 = 48 입니다.
//			
//			연산을 선택하세요. ->  ..4.
//			프로그램을 종료 합니다.Bye,,👍👍
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[[수학 공부 도우미]]");
		
		while(true) {
			System.out.println("1. 덧셈	2. 뺄셈	3. 곱셈	4. 종료");
			System.out.print("연산을 선택하세요. -> ");
			int s = sc.nextInt();
			
			if(s == 4) {
				System.out.println("프로그램을 종료 합니다.Bye,,👍👍"); 
				break;
			}
			else if(s == 1 || s == 2 || s == 3) {
				System.out.print("✏️  값 1 을 입력하세요. ->");
				int num1 = sc.nextInt();
				String a = sc.next();
				System.out.print("✏️  값 2 을 입력하세요. ->");
				int num2 = sc.nextInt();
				int num3 = num1 + num2;
				System.out.print("정답 : " + num1 +" " + a +" " + num2 + " = " + num3 + " 입니다.\n\n");
			}
			else if(s > 4) {
				System.out.println("잘못 입력하셨습니다.\n"); 
			}
			
			
			
			
		
		
		}
	}
}

