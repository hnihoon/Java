package koreait.day11;

public class Cat extends Animal{
	
	public Cat() {
		System.out.println("야옹이가 생성되었습니다.");
	}
	@Override
	public void sound() {
		System.out.println("🐱🐱🐱야옹");
	}
}
