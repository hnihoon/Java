package koreait.day11;

public class AnimalTest {

	public static void main(String[] args) {
		Puppy puppy = new Puppy();
		puppy.sound();
		puppy.setType("poodle");
		System.out.println("puppy type : " + puppy.getType());
		
		Cat cat = new Cat();		
		cat.sound();
	}

}
