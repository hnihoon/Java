package koreait.day07;

import java.util.Scanner;

public class DecipherTest {

	public static void main(String[] args) {
// 내용 : 쯔위가 모모가 보낸 암호 메시지를 받고 해독해서 확인합니다. key 약속된 7값을 알고 있습니다.
		Scanner sc = new Scanner(System.in);
		int key = 7;
		String cypherString;
		String message = "";
		char[] temp;		
		
		System.out.print("전달받은 암호 메시지 입력하세요. -> ");
		message = sc.nextLine();
		
		//message를 temp로 변환하여 참조합니다.
		temp = message.toCharArray();
		for(int i=0; i<temp.length; i++) {
			temp[i] += key;
		}
		
		cypherString = String.copyValueOf(temp);
		System.out.println("모모의 메시지 : " + cypherString);
	}

}
