package koreait.day08;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest3 {
	//2.문제
	//int 값 저장하는 배열을 활용하는 연습입니다. 
	public static void main(String[] args) {
		
		//배열의 크기는 20 -> 메모리 할당
		int[] scores = new int[20];
		
		//배열의 값은 난수 1~100 범위값 저장
		Random r1 = new Random(System.currentTimeMillis());	//난수 발생에 필요한 seed 값 설정
		for(int i=0;i<scores.length;i++) {
			scores[i] = r1.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(scores));
		
		//값의 분포 개수를 90~100, 80~89 , 70~79, 70미만
//		int cntA = 0;	//90~100
//		int cntB = 0;	//80~89
//		int cntC = 0;	//70~79
//		int cntD = 0;	//70미만
		int[] cnt = new int[4];
		
		//20개 배열의 값 중에서 70보다 큰값을 검색 - 인덱스와 값 출력
		for(int i=0; i<scores.length;i++) {
			//scores[0] , scores[1],scores[2].....scores[19]
		if(scores[i] >= 90) {
				cnt[0]++;
		} else if(scores[i] >=80) {
				cnt[1]++;
		} 
		 else if(scores[i] >= 70) {
			 	cnt[2]++;
		} 
		 else {
			 	cnt[3]++;
		 } 
		}
		System.out.println("90~100 인 값의 갯수 : " + cnt[0]);
		System.out.println("80~89 인 값의 갯수 : " + cnt[1]);
		System.out.println("70~79 인 값의 갯수 : " + cnt[2]);
		System.out.println("70미만 인 값의 갯수 : " + cnt[3]);

	}	
}

