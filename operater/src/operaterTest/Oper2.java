package operaterTest;

import java.util.Scanner;

public class Oper2 {
   public static void main(String[] args) {
//      두 정수 입력받기
	   
      int firstNumber = 0, lastNumber = 0; // 변수 선언 ( 두정수 입력 )
      boolean isBigger = false, isSame = false; // 논리 
      String message = "정수 두 개를 입력하세요", result = null; // 변수 선언 
      Scanner sc = new Scanner(System.in); // 입력 클래스 선언 
      
      System.out.println(message); // message 출력
      firstNumber = sc.nextInt();// 문자열을 정수로 바꿔줌 변수에 값 저장 
      lastNumber = sc.nextInt();// 문자열을 정수로 바꿔줌 변수에 값 저장 
      
      isBigger = firstNumber > lastNumber; // firstNumber가 lastNumber보다 크면 isBigger라는 변수에 저장 ( false )
      isSame = firstNumber == lastNumber; // firstNumber가 lastNumber랑 같으면 isSame라는 변수에 저장 ( false )
      
//      삼항연산자 사용 
//      firstNumber가 lastNumber보다 크면 큰값 : firstNumber출력 
//      firstNumber가 lastNumber랑 작으면 두 수가 같은지 판별하고 같으면 두수가 같습니다 출력하고,
//     	 같지 않으면 큰 값 : lastNumber 출력  
      result = isBigger ? "큰 값 : " + firstNumber : isSame ? "두 수가 같습니다" : "큰 값 : " + lastNumber; 
      
      
      System.out.println(result); // 결과값 출력 
   }
}