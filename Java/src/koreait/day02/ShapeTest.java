package koreait.day02;

public class ShapeTest {
//	[[사각형 도형의 넓이 구하기]]
//			가로 : 23 cm
//			세로 : 19 cm
//			넓이를 구했습니다. -> .... ㎠       ㄹ + 한자키로 입력
//
//
//			[[원 도형의 넓이와 둘레 구하기]]
//			반지름 : 23 cm
//			둘레를 구했습니다. -> ....  ㎠
//			넓이를 구했습니다. -> ....  ㎠
//
//			*참고 : 원의 둘레는 2*3.14*반지름
//			           넓이는 3.14*반지름*반지름
	public static void main(String[] args) {
//		사각형 넓이 구하기
		int x = 23; //가로
		int y = 19; //세로
		System.out.println("넓이 = " + x*y + "㎠");
		
//		원의 둘레 , 넓이 구하기
		double r = 23; //반지름
		double d = r*2*3.14;
		double s = r*r*3.14;
		System.out.printf("%.3f%s\n",d,"㎠");
		System.out.printf("%.3f%s\n",s,"㎠");
		
	}

}
