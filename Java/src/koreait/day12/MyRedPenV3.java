package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//0) MathProblem.java 클래스 객체들을  ArrayList 를 이용하여  저장합니다.(참조값 저장.)
//1) 덧셈 문제 10개 생성하여   addList 변수로 참조합니다.
//2) 맞은 문제(true),틀린 문제(false)를 boolean isCorrect; 필드를 추가하여 저장합니다. 
//		(선택사항:사용자 답을 저장하는 필드도 추가 가능합니다.) 
//3) 채점 후에 틀린문제를 정답과 함께 보여줍니다.
//4) 계속하시겠습니까?(종료:-999) 기능 추가하여 문제풀이 10개를 반복합니다.   

//*실행화면*
//----------------------------------------------
//빨간펜 수학 2자리 덧셈 문제 풀기
//---------------------------------------------- 
//시작합니다.
//문제 1.  23 + 56 =  답 입력 -> 
//문제 2.  33 + 19 =  답 입력 ->
//       :
//문제 10. 28 + 32 =  답 입력 ->
//
//----------------------------------------------
//채점 합니다. 맞은 갯수  ...  ( .. 점)
//::::: 틀린 문제 보기 :::::
//33 + 19 = 정답 : 52         
//       :

public class MyRedPenV3 {

	public static void main(String[] args) {
		ArrayList<MathProblem> addList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int ans;
		int cnt = 0;  //
		
		System.out.println("---------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("---------------------------------");
		System.out.println("시작합니다.");
		for(int i=0; i<5; i++) {
			
			MathProblem p1 = new MathProblem('+');
			addList.add(p1);
			p1.makeProb();	//문제 만드는 메소드 : 연산종류에 따라 숫자가 다른범위 난수로 만들어집니다.
			System.out.print("문제" + (i+1) + ".	" + p1 + " 답 입력 -> ");
			ans = sc.nextInt();
			if(ans == p1.showAnswer()) {
				cnt++; //p1.setCorrect(true);
			}
		} //for end
		System.out.println("---------------------------------");
		System.out.println("채점 합니다. 맞은 갯수 " + cnt + " ( " + (cnt*20) + " 점)");
		System.out.println("::::: 틀린문제 다시보기 :::::");
		for(MathProblem prob : addList ) {
			if(!prob.isCorrect())
				System.out.println(prob + "정답 : " + prob.showAnswer());
		}
	}
}
