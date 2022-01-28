package koreait.day07;

import java.util.Scanner;

public class CypherTest {
	//연습 예제
	//내용 : 모모가 쯔위에게 메시지를 전달하는데 비밀 메시지로 암호화를 합니다.
	//	모모와 쯔위는 암호를 푸는(해독,복호화) key 값으로 7 이라는 숫자를 정했습니다.
	//고대 암호 : 문자하나+key = ? 새로운문자 - > 이 방법으로 메시지를 암호화 해봅시다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key = 7;
		String cypherString;
		String message;
		char[] temp;
		
		System.out.print("전달받은 암호 메시지 입력하세요. -> ");
		cypherString = sc.nextLine();
		
		temp = cypherString.toCharArray();
		for(int i=0; i<temp.length; i++) {
			temp[i] -= key;
		}
		message = String.valueOf(temp);
		System.out.println("모모의 메시지 : " + message);

	}
	
	//이 예제의 결론 : String 을 char[] 배열로 변환 	- 문자열.toCharArray()
	//			 char[] 배열을 String으로 변환	- String.valueOf(문자배열)
}

