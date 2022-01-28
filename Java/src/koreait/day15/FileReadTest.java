package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadTest {
//System.in : 표준입력(콘솔/모니터 출력) 지금까지 입력은 표준입력입니다. 이제는 파일입력을 연습합니다.
	public static void main(String[] args) {
		//파일입력 : 데이터를 파일에서 읽어옵니다.
		
		String filename = "D:\\dav\\test\\자바테스트.txt";	//역슬래쉬 \는 \\로 해야합니다.
		
		//파일객체를 생성합니다.
		File file = new File(filename);
		
		//file 연수가 참조하는 File 클래스 객체를 데이터 입력에 사용하기 위해 클래스는 Scanner 입니다.
		
		try {
			Scanner fsc = new Scanner(file);
			
//			String temp = fsc.nextLine();	//행(line) 단위로 읽어옵니다.
//			System.out.println("읽어온 문자열 : " + temp);
			System.out.println("-----------------------------");
			while(fsc.hasNext()) {	//읽어올 라인이 있다면 반복
				System.out.println(fsc.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
