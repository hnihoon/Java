package koreait.day02;

public class IntegerData {

	public static void main(String[] args) {
		// 정수 데이터 형식 연습(byte 1byte, short 2byte, integer 4byte,long 8byte)
		
		System.out.println("::: 1바이트에 저장하는 Byte 정수 확인 :::");
		System.out.println("Byte 정수의 크기 : " + Byte.BYTES);
		System.out.println("Byte 정수의 최소값 : " + Byte.MIN_VALUE);
		System.out.println("Byte 정수의 최대값 : " + Byte.MAX_VALUE);
		//Byte 클래스의 필드(특정 값을 저장) " BYTES, MIN_VALUE, MAX_VALUE
		//필드는 일반적으로 모두 대문자로 표기합니다.
		System.out.println("-------------------------------------");
		
		System.out.println("::: 2바이트에 저장하는 Short 정수 확인 :::");
		System.out.println("Short 정수의 크기 : " + Short.BYTES);
		System.out.println("Short 정수의 최소값 : " + Short.MIN_VALUE);
		System.out.println("Short 정수의 최대값 : " + Short.MAX_VALUE);
		System.out.println("-------------------------------------");
		
		System.out.println("::: 4바이트에 저장하는 Integer 정수 확인 :::");
		System.out.println("Integer 정수의 크기 : " + Integer.BYTES);
		System.out.println("Integer 정수의 최소값 : " + Integer.MIN_VALUE);
		System.out.println("Integer 정수의 최대값 : " + Integer.MAX_VALUE);
		System.out.println("-------------------------------------");
		
		System.out.println("::: 8바이트에 저장하는 Long 정수 확인 :::");
		System.out.println("Long 정수의 크기 : " + Long.BYTES);
		System.out.println("Long 정수의 최소값 : " + Long.MIN_VALUE);
		System.out.println("Long 정수의 최대값 : " + Long.MAX_VALUE);
	}

}
