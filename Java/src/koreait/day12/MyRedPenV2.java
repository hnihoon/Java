package koreait.day12;

import java.util.Scanner;

public class MyRedPenV2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char op;
		
		do {
			System.out.print("연산입력 -> ");
			op=sc.nextLine().charAt(0);	//charAt(0) 메소드로 입력받은 문자열의 첫번째 문자를 저장합니다.
			if(op=='0') {
				System.out.println("프로그램을 종료합니다.!!!");
				//do ~ while 아니고 while(true) 반복문이면 이 위치에 break; 로 합니다.	
			}
			else if(!(op=='+' || op=='-' || op=='*' || op =='/')) {
				System.out.println("잘못된 선택입니다.");
				continue;
			} 
			else {	//op는 '+' , '-' , '*' , '/' 중 하나일때만 해당됩니다.
				MathProblem p1 = new MathProblem(op);
				p1.makeProb();
				//p1.print();
				System.out.println(p1);		//toString 재정의 적용
				System.out.println("정답 : " + p1.showAnswer());
			}
			
		}while(op!='0');
	}

}
