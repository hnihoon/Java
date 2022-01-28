package koreait.day09;

import java.util.Scanner;

/* 1) StudentScore 클래스 만들어 보기
	 * 
	 * 필드 : 번호(num), 이름(name) , 국어점수(korean), 영어점수(english) , 과학(science)
	 * 메소드 : 모든 필드값 출력하는 메소드 printScore
	 *   총점 계산하고 결과값 리턴하는 메소드 sum
	 *   평균(실수) 계산하고 결과값 리턴하는 메소드 avg
	 */
public class StudentScore {
		Scanner sc = new Scanner(System.in);
		 int num;
		 String name;
		 int korean;
		 int english;
		 int science;
		
		 void printScore() {
			 System.out.print("번호 : " + num + "\t이름 : " + name + "\t국어점수 : " + korean + "\t영어점수 : " + english + "\t과학점수 : " + science+"\n" ); 
		 }
		 
		 int sum() {
			int sum = korean + english + science;
			return sum;
		}
		 
		 double avg() {
			double avg = (double)(sum())/3;
			return avg;
	}
		 
		 @Override
		protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		   sc.close();
		}
		 
//			추가로 키보드 입력을 받는 메소드를 만들면 좋겠습니다.
			void inputData() {
				//아직 객체가 생성되지 않은 상태이므로 클래스에서 this를 사용합니다. 
				//this는 실행할때 이 메소드를 실행하는 객체가 됩니다. 
				System.out.print("이름 ->  " );  		this.name = sc.nextLine();
				System.out.print("번호 ->  " ); 		this.num= sc.nextInt();
				System.out.print("국어 ->  " ); 		this.korean = sc.nextInt();
				System.out.print("영어 ->  " );		this.english = sc.nextInt();
				System.out.print("과학 ->  " );		this.science = sc.nextInt();
			}
	}

