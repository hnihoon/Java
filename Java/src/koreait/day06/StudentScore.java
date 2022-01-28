package koreait.day06;

import java.util.Scanner;

/* 1) StudentScore 클래스 만들어 보기
	 * 
	 * 필드 : 번호(num), 이름(name) , 국어점수(korean), 영어점수(english) , 과학(science)
	 * 메소드 : 모든 필드값 출력하는 메소드 printScore
	 *   총점 계산하고 결과값 리턴하는 메소드 sum
	 *   평균(실수) 계산하고 결과값 리턴하는 메소드 avg
	 */
public class StudentScore {
		
		 int num;
		 String name;
		 int korean;
		 int english;
		 int science;
		
		 void printScore() {
			 System.out.println("번호 : " + num + "\n이름 : " + name + "\n국어점수 : " + korean + "\n영어점수 : " + english + "\n과학점수 : " + science ); 
		 }
		 
		 int sum() {
			int sum = korean + english + science;
			return sum;
		}
		 
		 double avg() {
			double avg = (double)(sum())/3;
			return avg;
	}
		 
//			추가로 키보드 입력을 받는 메소드를 만들면 좋겠습니다.
			void inputData() {
				Scanner sc = new Scanner(System.in);
				//아직 객체가 생성되지 않은 상태이므로 클래스에서 this를 사용합니다. 
				//this는 실행할때 이 메소드를 실행하는 객체가 됩니다. 
				System.out.print("이름 ->  " );  		this.name = sc.nextLine();
				System.out.print("번호 ->  " ); 		this.num= sc.nextInt();
				System.out.print("국어 ->  " ); 		this.korean = sc.nextInt();
				System.out.print("영어 ->  " );		this.english = sc.nextInt();
				System.out.print("과학 ->  " );		this.science = sc.nextInt();
			}
	}

