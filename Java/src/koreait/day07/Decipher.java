package koreait.day07;

import java.util.Scanner;

public class Decipher {

	public static void main(String[] args) {
// 내용 : 쯔위가 모모가 보낸 암호 메시지를 받고 해독해서 확인합니다. key
		Scanner sc = new Scanner(System.in);
		int key = -7;
		String message;
		String cypherString;
		char[] temp; 	//초기값선언과 배열크기 선언도 없이 할 수 있습니다.
		char c = 'a';
		
		System.out.print("보내고 싶은 원본 메시지 입력하세요. -> ");
		message = sc.nextLine();
		
		//message를 temp로 변환하여 참조합니다.
		temp = message.toCharArray();
		
		//문자하나+key 결과값은 temp 배열에 저장합니다.
		for(int i=0; i<temp.length; i++) {
//			temp[i] = temp[i]+key;
			temp[i] += key;		//축약 연산자는 강제 캐스팅 안하고 연산고 대입.
		}
		
		System.out.println(temp);
		
		//추가 기능 : temp 문자배열을 문자열로 변환 참조.
		cypherString = String.valueOf(temp);	//String.valueOf 메소드는 여러타입 데이터를 문자열로 변환.
		System.out.println("암호 메시지 : " + cypherString);		//p'sprl'qh}h
		System.out.println((int)c);
	}

}
