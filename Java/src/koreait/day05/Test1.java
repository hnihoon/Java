package koreait.day05;

import java.util.Scanner;

public class Test1 {
//	[[수학 공부 도우미]]
//	
//	1. 덧셈       2. 뺄셈    3. 곱셈      4. 종료
//	
//	연산을 선택하세요. ->  ..1..
//	✏️  값 1 을 입력하세요. ->  ..34..
//	✏️  값 2 을 입력하세요. ->  ..23..
//	정답  : 34 + 23 = 57 입니다.
//	
//	연산을 선택하세요. ->  ..2..
//	✏️  값 1 을 입력하세요. ->  ..71..
//	✏️  값 2 을 입력하세요. ->  ..23..
//	정답  : 71 - 23 = 48 입니다.
//	
//	연산을 선택하세요. ->  ..4.
//	프로그램을 종료 합니다.Bye,,👍👍
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char op = ' ';
		System.out.println("[[수학 공부 도우미]]");
		System.out.println("1. 덧셈       2. 뺄셈    3. 곱셈      4. 종료\n");
		
		while(true) {
			int num1, num2 ,num3 = 0;
			System.out.print("연산을 선택하세요 -> ");
			int sel = sc.nextInt();
			
			if(sel == 4) {
				System.out.println("프로그램을 종료 합니다.Bye,,👍👍");
				break;
			}
			else if(sel <= 0 || sel > 4) {
				System.out.println("잘못 입력하셨습니다.\n");
				continue;
			}
			System.out.print("✏️  값 1 을 입력하세요. ->");
			num1 = sc.nextInt();
			System.out.print("✏️  값 2 을 입력하세요. ->");
			num2 = sc.nextInt();
			
			if(sel == 1) {
				op = '+';
				num3 = num1 + num2;
			}
			if(sel == 2) {
				op = '-';
				num3 = num1 - num2;
			}
			if(sel == 3) {
				op = '*';
				num3 = num1 * num2;
			}
			System.out.printf("정답 : %d %s %d = %d\n\n",num1,op,num2,num3);
			
		}
	}

}
