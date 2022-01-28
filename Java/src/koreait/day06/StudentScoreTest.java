package koreait.day06;

import java.util.Scanner;

public class StudentScoreTest {

	// 작성자 : 김동훈
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentScore student = new StudentScore();
		
		System.out.print("번호 -> ");
		student.num = Integer.parseInt(sc.nextLine());
		System.out.print("이름 -> ");
		student.name = sc.nextLine();
		System.out.print("국어 -> ");
		student.korean = sc.nextInt();
		System.out.print("영어 -> ");
		student.english = sc.nextInt();
		System.out.print("과학 -> ");
		student.science = sc.nextInt();
		student.printScore();
		System.out.println("총점 : " + student.sum());
		System.out.println("평균 : " + student.avg());
	}


}
