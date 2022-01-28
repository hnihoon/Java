package koreait.day14;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalCommunity2 {
	//반려동물 커뮤니티에는 무엇이 필요할까요? 용품 공동구매 , 반려<동물>분양, .... , <회원>
	public static void main(String[] args) {
		//동물클래스 배열에 고양이(Cat) 객체 , 강아지객체 , 토끼(Rabbit) 객체.. 등을 참조하도록 합니다.
		//분양가능한 동물객체를 생성해서 참조하기
		ArrayList<Animal>animals = new ArrayList<>();	//참조값 10개를 저장할 수 있다. Animal 객체가 10개가 만들어졌다?X
		
		animals.add(new Puppy("브라우니",""));  //index 0
		animals.add(new Cat());				 //index 1
		animals.add(new Rabbit("바니바니", "white")); //index 2
		animals.get(1).setName("냥이");
		animals.get(1).setColor("Black");
		animals.add(new Puppy());			//index 3

		System.out.println("[[환영합니다. 반려동물을 보여드리겠습니다.]]\n");
		for(int i=0; i<animals.size(); i++) {
			animals.get(i).sound();
		}
		Member sana = new Member("사나",15);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("분양을 원하는 아이의 숫자를 선택해 주세요.");
		int sel = sc.nextInt();
		
		System.out.println("선택하신 " + animals.get(sel-1) + "는 ");
		if(sana.isAdopt(animals.get(sel-1))){
			System.out.print("😍분양 가능합니다.");
		} else {
			System.out.print("😥 분양 하실 수 없는 나이 입니다.");
		}
		
	}
}

