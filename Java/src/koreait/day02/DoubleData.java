package koreait.day02;

public class DoubleData {

	public static void main(String[] args) {
		// 실수 데이터 형식 : Wrapper 클래스는 Float, Double
		// 			   : 기본형은 float , double(기본형식)
		
		System.out.println("::: 4바이트에 저장하는 Short 정수 확인 :::");
		System.out.println("Float 정수의 크기 : " + Float.BYTES);
		System.out.println("Float 정수의 최소값 : " + Float.MIN_VALUE);
		System.out.println("Float 정수의 최대값 : " + Float.MAX_VALUE);
		System.out.println("--------------------------------------");
		
		System.out.println("::: 8바이트에 저장하는 Short 정수 확인 :::");
		System.out.println("Double 정수의 크기 : " + Double.BYTES);
		System.out.println("Double 정수의 최소값 : " + Double.MIN_VALUE);
		System.out.println("Double 정수의 최대값 : " + Double.MAX_VALUE);
	}

}
