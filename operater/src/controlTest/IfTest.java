package controlTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		두 정수 입력 받고 대소 비교
		
		int firstNum = 0, lastNum =0; 
		String message = "두 정수 입력 :",resultMessage = null; // 변수 선언 
		
		Scanner sc = new Scanner(System.in); // 입력 클래스 
		
		System.out.println(message); // message값 출력 
		
		firstNum = sc.nextInt(); 
		lastNum = sc.nextInt(); // 문자열을 정수값으로 변환하여 firstNum,lastNum에 저장 
		
		if (firstNum>lastNum) { //firstNum이 lastNum 크면
			resultMessage ="큰 값 : " + firstNum; // firstNum이 큰값으로 출력
		} else if (firstNum != lastNum) {  // 만약 두값이 같지 않으면 
			resultMessage ="큰 값 : " + lastNum; // lastNum이 큰값으로 출력
		} else { // 두수가 같으면
			resultMessage ="두 수가 같습니다"; // 두 수가 같습니다 출력
		}System.out.println(resultMessage); // resultMessage 출력
	}
}
