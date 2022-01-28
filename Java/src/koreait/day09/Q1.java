package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
//	*실행화면*
//	------------------------------
//	숫자 맞추기 게임 시작합니다.	나 컴퓨터는 숫자를 결정했습니다.
//	너 휴먼은 맞춰보세요.
//	생각한 숫자 입력 -> ....
//	아닙니다. 더 큰값입니다.
//	생각한 숫자 입력 -> ....
//	아닙니다 더 작은값입니다.
//	생각한 숫자 입력 -> ....
//	딩동댕 맞추셨습니다. 지금까지 시도한 값 ... ... ... ... 4번만에 정답입니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int com = r.nextInt(100)+1;
		int myNumber = 0;
		int[] number = new int[100];
		int count = 0;
		System.out.println("너 휴먼은 맞춰보세요");
		while(myNumber != com) {
		System.out.print("생각한 숫자 입력 -> ");
		myNumber = sc.nextInt();
			if(myNumber < com) {
				System.out.println("아닙니다. 더 큰값입니다.");
				number[count] = myNumber;
				count++;
			}
			else if(myNumber > com) {
				System.out.println("아닙니다. 더 작은값입니다.");
				number[count] = myNumber;
				count++;
			} 
			else {
				System.out.print("딩동댕 맞추셨습니다. 지금까지 시도한 값 ");
				number[count] = myNumber;
				count ++;
			}
		
		}
		for(int i=0; i<count; i++) {
			System.out.print(number[i] + ", ");
	}
		System.out.print(count+"번만에 정답입니다.");
		
	}
}


