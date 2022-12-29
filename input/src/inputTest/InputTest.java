package inputTest;

import java.util.Scanner; //Ctrl+shift+o

public class InputTest {
	public static void main(String[] args) {
//		초기값 :어떤 값을 넣을지 아직 모를 때
//		정수 : 0
//		실수: 0.0
//		문자: ' '
//		문자열 : null 또는 ""
		
		Scanner sc = new Scanner(System.in); //입력 클래스 
		int name = 0; // name 변수 선언
		
		System.out.print("이름:");  //출력 
		
		name = sc.nextInt(); //문자열 정수로 변환
		
		System.out.print(name+ "님 환영합니다.");
		
	}

}
