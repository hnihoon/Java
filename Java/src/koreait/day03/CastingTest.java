package koreait.day03;

public class CastingTest {	//데이터의 형식 변환(Type Casting)을 연습합니다.
// 필요한 이유 : 대입,연산(사칙연산 등) 을 실행할때 같은 형식으로 일치를 시켜야 합니다.
	public static void main(String[] args) {
		
		short sval1 = 11;	// int 보다 작은 크기의 리터럴은 없습니다. 11은 4바이트, sval변수는 2바이트 -> 자동캐스팅
//		sval1 = 40000;   // 오류발생
//		sval1 = sval1 + sval1;   // 4바이트로 연산하기 때문에 오류발생, 강제 캐스팅이 필요합니다.
		
		float fval1 = 1.23f;
		fval1 = fval1 + fval1;		// float 으로 연산하기 때문에 정상 실행
		
		sval1 = (short)40000;	// 강제 캐스팅 -> 데이터 손실 오류(정확한 값이 아님)
		sval1 = (short)(sval1+sval1);
	}

}
//byte(1byte) -> short(2byte) -> int(4byte) -> long(8byte) -> float(4byte) -> double(8byte)
//1. 자동 캐스팅 : = 를 기준으로 오른쪽의 데이터가 크기가 작은 것(리터럴,변수,연산식)을 왼쪽의 큰 타입 변수로 대입
//        : 정수는 4 바이트보다 작은 타입은 int 리터럴을 사용하며 표현 범위에서 벗어나면 오류가 발생합니다. 
//        : 연산할 때 정수는 4 바이트보다 작은 타입은 int 로 변환된 후에 연산합니다. 
//			 : 실수는 float 과 double 각각 타입에 따라 연산합니다.
//2. 강제 캐스팅 : ()안에 변환하고자 하는 기본형 타입을 표시하여 실행합니다.
