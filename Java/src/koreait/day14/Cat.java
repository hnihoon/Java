package koreait.day14;

public class Cat extends Animal{

	static final String TYPE = "๊ณ ์์ด";
	
	public Cat() {
		
	}
	
	public Cat(String name, String color) {
		super(name,color);
	}
	
	public void sound() {
		System.out.println("๐บ๐บ์ผ์น");
	}
		
	@Override
	public String toString() {
		return super.toString() + " - Type: " + TYPE;	//super๋ Animal ํด๋์ค toString
	}
}
