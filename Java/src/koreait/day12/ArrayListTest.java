package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

	public static void main(String[] args) {
		
		int[] datas = {1,5,7,9,11};
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(1);
		intList.add(5);
		intList.add(7);
		intList.add(9);
		intList.add(11);
		System.out.println(intList);
		System.out.println(datas);
		System.out.println(Arrays.toString(datas));
		
		System.out.println("list 의 크기 : " + intList.size());
		
		intList.add(2,99);
		System.out.println(intList);
		System.out.println("list 의 크기 : " + intList.size());
		
		//삭제
		intList.remove(3);
		System.out.println(intList);
		System.out.println("list 의 크기 : " + intList.size());
		
		//특정 인덱스 위치 값 가져오기
		int temp = intList.get(3);
		System.out.println("인덱스 3데이터" + temp);
		System.out.println("인덱스 2데이터" + intList.get(2));
		
		//contains 메소드
		System.out.println(intList.contains(99));
		System.out.println(intList.contains(100));
		
		
		//intList 의 모든값을 index=.. element=.. 형식으로 출력해보세요->for문(반복횟수는 데이터갯수입니다.)
		
		for(int i=0; i<intList.size(); i++) {
			System.out.println("index= " + i + " element = " + intList.get(i));
		}
	
		
		
	}

}
