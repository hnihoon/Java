package koreait.day14;

public class Rabbit extends Animal{
	
	static final String TYPE = "ํ ๋ผ";
	
	public Rabbit() {
		
	}
	
	public Rabbit(String name, String color) {
		super(name,color);
	}
	
	@Override
	public void sound() {
		System.out.println("๐ฐ๐ฐ์ ๋ง์ ๋ชปํด");
	}
	
	@Override
	public String toString() {
		return super.toString() + " - Type: " + TYPE;	//super๋ Animal ํด๋์ค toString
	}
}
