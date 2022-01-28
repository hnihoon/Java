package koreait.day11;

//1) Animal.java   : 필드 color, name (private 접근자)
//2)               : getter,setter 메소드
//3)               : 생성자는 기본생성자에서 "새로운 반려동물 가족이 생겼습니다."   출력하기 입니다.
//4)               : 메소드는 void sound()  "소리를 내는 동물입니다." 출력
//5) Puppy.java    : 필드 type (문자열,private) , getter/setter 메소드
//6)               : 메소드 sound() 재정의  "🐶" 동물모양 이모지 출력
//7) AnimalTest.java : main 메소드 포함합니다.
//8) 				 : Puppy 객체를 생성하고 변수명 puppy로 참조합니다.
//9) 				 : 실행하고 결과 확인해보세요.
//10)				 : 8)번의 객체로 sound 메소드 실행하세요.
//11)				 : 8)번 객체의 type 필드값을 "poodle" 로 하고 출력해서 확인하세요

public class Animal {
	
	private String clolr;
	private String name;
	
	//default 생성자 - 출력내용 작성합니다.
	public Animal() {
		System.out.println("Animal:새로운 반려동물 가족이 생겼습니다.");
	}
	
	//인스턴스 메소드 - 인스턴스 필드값으로 동작합니다.
	public void sound() {
		System.out.println("Animal:소리를 내는 동물입니다. 이름은" + name);
	}
	
	//getter
	public String getClolr() {
		return clolr;
	}
	
	public String getName() {
		return name;
	}
	
	//setter
	public void setClolr(String clolr) {
		this.clolr = clolr;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
