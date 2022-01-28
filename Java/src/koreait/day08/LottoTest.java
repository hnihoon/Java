package koreait.day08;

import java.util.Arrays;
import java.util.Random;

public class LottoTest {

	public static void main(String[] args) {
		// 난수 1~46 범위의 값을 중복되는 값이 없도록 6개 생성하고 배열에 저장합니다.
		
		int[] lotto = new int[6];
		Random r1 = new Random();
		boolean isOk = true;
		for(int i=0; i<6; i++) {
			int temp = 0;
			isOk = true;
			while(isOk) {
				temp = r1.nextInt(46)+1;	//1~46	
				System.out.println("만든값 : " + temp);
				int j=0;
				for(j=0;j<i; j++) {	//j==i 이면 for종료합니다.
					//현재 배열 인덱스 i의 앞에 있는 값들과 temp 값을 비교
					if(temp==lotto[j]) {
						System.out.println("*");
						break;	//for-j 에서 탈출.
								//i는 4로 예를 들면,1) j가 2의 배열값이 temp와 같다면
								//for-j 탈출 했을때 아래**부분의 조건은 참? 거짓?
								//2) j=0~3까지 배열값 비교했을때 모두 temp와 다른 값이라면 
								//그 때 아래**부분의 조건은 참? 거짓?
						
						
					}
					
			}	//for - j end
				if(j==i) isOk = false;	//비교하는 동안 같은 값이 없을 때 입니다.
				
			} 	//while end
			
			lotto[i]=temp;
		}	//for - i end
		
		System.out.println(Arrays.toString(lotto));
		
	}

}
