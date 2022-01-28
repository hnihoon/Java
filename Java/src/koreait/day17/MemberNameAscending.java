package koreait.day17;

import java.util.Comparator;

public class MemberNameAscending implements Comparator<Member>{
	//Member 클래스 비교 기준 : 이름 오름차순
	
	@Override
	public int compare(Member o1, Member o2) {
		String a = o1.getName();		//int를 Integer타입으로 참조
		String b = o2.getName();

		return a.compareTo(b);
	}
}
