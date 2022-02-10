package koreait.day20;

public class StringComparToTest {

	public static void main(String[] args) {
		//배열에 저장된 값은 참조(데이터의 주소)값이다.
		//참조값으로 접근한 문자열은 > , < 로 비교하지 않는다. 
		
		String[] names = {"boa","momo","nayeon" , "zun" ,"nana"};
		
		System.out.println("문자열비교1 : " + "boa".compareTo("nana"));	//왼  < 오-12
		System.out.println("문자열비교1 : " + "momo".compareTo("nana"));	//		-1
		System.out.println("문자열비교2 : " + "nana".compareTo("boa"));	//왼쪽 > 
		System.out.println("문자열비교2 : " + "nana".compareTo("momo"));
		
		
		System.out.println("한글문자열비교1:" + "고양이".compareTo("염소"));   //왼 < 오 -
		System.out.println("한글문자열비교1:" + "고양이".compareTo("고양니"));	//왼 > 오  +
		System.out.println("한글문자열비교2:" + "다람쥐".compareTo("고양이"));	//왼 > 오  +
		
		System.out.println("문자열비교2 : " + "nana".compareTo("nana"));	//0
	}
}
