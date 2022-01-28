package koreait.day17;

public class StudentScore {
	private int num;
	private String name;
	private int korean;
	private int english;
	private int science;
	
	public StudentScore(int num, int korean, int english, int science) {
		this.num = num;
		this.korean = korean;
		this.english = english;
		this.science = science;
	}

	//문제 1) toString 메소드 재정의 하세요. (참고:실행활명)

	int sum() {
		return (korean+english+science);
	}
	
	double avg() {
		return (double)sum()/3;
	}
	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public int getEnglish() {
		return english;
	}

	public int getScience() {
		return science;
	}

	@Override
	public String toString() {
		return "[번호 : " + num +  "\t이름 : " + name + "]\t국어 : " + korean + "\t영어 : " + english + "\t과학 : " + science + "\t-총점 : " + sum() + "평균 : " + avg();
	}
	
	
}
