package koreait.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomPrimeNum {

	public static void main(String[] args) {
		// 주어진 난수 범위에서 소수를 7개 만듭니다. (난수가 소수인지 판별해서 그 값이 7개가 되면 반복 종료) 소수 7개는 배열 저자하여 출력합니다.
		Random r = new Random();
		
		long start = System.currentTimeMillis();	//현재시간을 ms(0.0001초) 단위로 가져옵니다. 형식은 long
		
		int[] primenum = new int[7];
		int cnt=0,max=999999999,min=0;
		while(cnt<primenum.length){
			int temp = r.nextInt(max-min+1)+min;
			if(isPrime(temp))
				primenum[cnt++] = temp;
		}
		long end = System.currentTimeMillis();
		System.out.println("실행시간 = " + (end-start) + " ms 소요되었습니다.");	//0ms 는 매우 짧은시간이 걸렸다는 뜻
		System.out.println(Arrays.toString(primenum));
		
}
	// -> 주어진 정수값이 소수인지 판별하는 메소드를 만들어 봅시다.(메소드 이름 isPrime, 리턴형식은 boolean, 인자는 정수 1개)
	public static boolean isPrime(int num) {
		boolean result = true;
		for(int i = 2; i< Math.sqrt(num); i++) {
			if(num % i == 0) {
				result = false;
				break;
		}
	}
		return result;
	
	}
}
