package koreait.day07;

import java.util.Scanner;

public class EvenOddNumber {

	//작성자 : 김동훈
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		"1.version"
//		String even_string = "";
//		String odd_string = "";
//		System.out.println("*실행화면*");
//		System.out.println("-----------------------------");
//		System.out.print("문자열(공백과 기호, 숫자 포함)을 입력하세요. -> ");
//		String src_string = sc.nextLine();
//		for(int i=0; i < src_string.length(); i++) {
//			if(i %2 == 0) {
//				even_string += src_string.charAt(i);
//			} else {
//				odd_string += src_string.charAt(i);
//			}
//		}
//		System.out.println(even_string);
//		System.out.println(odd_string);
		
//		"2.version"
//		char[] c;
//		String even_string = "";
//		String odd_string = "";
//		System.out.println("*실행화면*");
//		System.out.println("-----------------------------");
//		System.out.print("문자열(공백과 기호, 숫자 포함)을 입력하세요. -> ");
//		String src_string = sc.nextLine();
//		c = src_string.toCharArray();
//		for(int i=0; i < src_string.length(); i++) {
//			if(i %2 == 0) {
//				even_string += c[i];
//			} else {
//				odd_string += c[i];
//			}
//		}
//		System.out.println(even_string);
//		System.out.println(odd_string);
		
//		String src_string;
//		String even_string="";
//		String odd_string="";
//		System.out.print("문자열(공백과 기호,숫자 포함)을 입력하세요. ->");
//		src_string = sc.nextLine();
//		
//		for(int i=0;i<src_string.length();i++) {              
//			if(i%2==0) even_string +=src_string.charAt(i);
//			else odd_string+=src_string.charAt(i);
//		}
//		
//		System.out.print("\n[[결과]] ");
//		System.out.println("짝수 문자열 ....." + even_string);
//		System.out.println("홀수 문자열 ....." + odd_string);
		
		String src_string;
		String even_string="";
		String odd_string="";
		char[] even = new char[30];   
		char[] odd = new char[30];   
		System.out.print("문자열(공백과 기호,숫자 포함)을 입력하세요. ->");
		src_string = sc.nextLine();
		
		for(int i=0;i<src_string.length();i++) {               
			if(i%2==0) even[i/2]=src_string.charAt(i);
			else odd[i/2]=src_string.charAt(i);
		}
		even_string = String.valueOf(even);
		odd_string = String.valueOf(odd);
		
		System.out.print("\n[[결과]] ");
		System.out.println("짝수 문자열 ....." + even_string);
		System.out.println("홀수 문자열 ....." + odd_string);
		
	}

		
		
	}

