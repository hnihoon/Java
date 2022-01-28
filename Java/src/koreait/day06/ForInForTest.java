package koreait.day06;

public class ForInForTest {

	public static void main(String[] args) {
		
//		for(int i = 0; i < 1; i++)
//			System.out.print("*");
//		System.out.println();
//		
//		for(int i = 0; i < 2; i++)
//			System.out.print("*");
//		System.out.println();
//		
//		for(int i = 0; i < 3; i++)
//			System.out.print("*");
//		System.out.println();
//		
//		for(int i = 0; i < 4; i++)
//			System.out.print("*");
//		System.out.println();
//		
//		for(int i = 0; i < 5; i++)
//			System.out.print("*");
//		System.out.println("\n\n\n");
		
		for(int k = 0; k < 6; k++) {
			for(int i = 0; i <= k; i++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println("\n\n\n");
		for(int k = 0; k < 6; k++) {
			for(int i = 0; i < k; i++)
				System.out.print(i);
			System.out.println("\t\t\t-"+k);
		}
	}

}
