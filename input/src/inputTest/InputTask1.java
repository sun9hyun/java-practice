package inputTest;

import java.util.Scanner;

public class InputTask1 {
   public static void main(String[] args) {
//       두 정수를 입력한 뒤 덧셈 결과 출력
//       단, next()만 사용
      
      int firstNumber = 0, lastNumber = 0, result = 0;
      String firstNumberMsg = "첫번째 정수 : ", lastNumberMsg = "두번째 정수 : "; // 변수선언
      
      Scanner sc = new Scanner(System.in); // 입력 클래스
      
      System.out.print(firstNumberMsg); //출력 
      
      firstNumber = Integer.parseInt(sc.next()); // 문자열을 정수로 변환한 후 변수에 값 저장 
      
      System.out.print(lastNumberMsg); // 출력
      
      lastNumber = sc.nextInt(); // 문자열을 정수로 변환한 후 변수에 값 저장 
      
      result = firstNumber + lastNumber; //result 변수에 두 수 더한 값 저장 
      
      System.out.printf("%d + %d = %d", firstNumber, lastNumber, result);
      
   }
}