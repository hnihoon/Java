package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriteTest {
//System.out : 표준출력/(콘솔/모니터 출력) 지금까지 출력은 표준출력입니다. 이제는 파일출력을 연습합니다.
//파일 출력의 기본 : 경로(어디에 있는 파일인지) , 파일명(파일이름)
	public static void main(String[] args) {
		
		String filename = "D:\\dav\\test\\자바테스트.txt";	//역슬래쉬 \는 \\로 해야합니다.
		
		//파일객체를 생성합니다.
		File file = new File(filename);
		
		//file 참조하는 파일객체를 데이터 출력에 사용하기 위한 클래스는 PrintWriter 입니다.
		try {	//파일입력 또는 파일출력 할 때 자바는 꼭 try ~ catch 로 처리하도록 합니다.
			
			PrintWriter pw = new PrintWriter(file);
			//파일에 쓰기
			pw.println("모모 90 88 79");
			pw.println("사나 77 55 99");
			
			pw.close();
			System.out.println("파일 출력이 완료되었습니다.");
		} catch (FileNotFoundException e) {	//파일출력은 파일없으면 자동생성합니다. Exception 안생깁니다.
				//그러나 없는 경로를 지정하면 Exception 생깁니다.
			System.out.println("없는 파일을 선택하셨습니다.(" + e.getMessage() + ")");
		}
	}

}
