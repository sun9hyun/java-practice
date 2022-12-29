package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args) throws IOException{ // throws 예외던지기 (메소드를 사용한 쪽으로)
		
		//		절대 경로 : 어디에서 작성해도 찾아갈 수 있는 경로, C:/a/b
		//		상대 경로 : 현재 위치에 따라 변경되는 경로, ../a/b
//		
//try {
//	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt",true));
////	bufferedWriter.write("한동석\n");
//	bufferedWriter.write("한동석");
//	bufferedWriter.newLine();
//	bufferedWriter.close();
//} catch (Exception e) {
//	e.printStackTrace();
//		}
		File file = new File("test.txt");
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = bufferedReader.readLine()) != null) {
				System.out.print(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로는 존재하지 않습니다.");
		}
		
	}
}
