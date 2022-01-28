package koreait.day05;

import java.util.Scanner;

public class MyDay05Test {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int upper_cnt=0 , lower_cnt=0, numeric_cnt=0, symbol_cnt=0 , error_cnt = 0;
	
	System.out.println("[[사용자 패스워드 검사]]");
	System.out.print("사용할 패스워드 입력하세요 -> ");
	
	String password = sc.next();
	
	if(password.length() < 8) {
		System.out.println("1) 8글자 이상으로 작성해 주세요."); 
	}
	
	for(int i = 0; i < password.length(); i++) {
		char temp = password.charAt(i);
		String temp2 = password.substring(i);
		
		if(temp >= 'A' && temp <= 'Z')
			upper_cnt++;//대문자 개수증가
		else if(temp >= 'a' && temp <= 'z')
			lower_cnt++;//소문자 개수증가
		else if(temp >= '0' && temp <= '9')
			numeric_cnt++;//숫자 개수증가
		else if(temp >= 32 && temp <= 47 || temp >= 58 && temp <= 64 
				|| temp >= 91 && temp <= 96 
				|| temp >= 123 && temp <= 126)
			symbol_cnt++;//기호 개수증가
		if(temp2.equals("<") && temp2.equals(">") && temp2.equals("(") && temp2.equals(")") 
				&& temp2.equals(";") && temp2.equals("%") && temp2.equals(" ") && temp2.equals("\\"));
			error_cnt++;
	}
	System.out.println("대문자 개수 : " + upper_cnt);
	System.out.println("소문자 개수 : " + lower_cnt);
	System.out.println("숫자 개수 : " + numeric_cnt);
	System.out.println("기호 개수 : " + symbol_cnt);
	if(upper_cnt < 1)
		System.out.println("2) 영문대문자 1개 이상 포함해야 합니다."); 
	if(lower_cnt < 1)
		System.out.println("3) 영문소문자 1개 이상 포함해야 합니다."); 
	if(numeric_cnt < 1)
		System.out.println("4) 숫자 1개 이상 포함해야 합니다."); 
	if(symbol_cnt < 1)
		System.out.println("5) 기호 1개 이상 포함해야 합니다.");
	if(password.length()>=8 && upper_cnt >=1  && lower_cnt >= 1 && numeric_cnt >=1 && symbol_cnt >=1)
		System.out.println("사용할 수 있는 패스워드 입니다.");
	else
		System.out.println("패스워드 작성 규칙에 맞지 않습니다.");
	}
}