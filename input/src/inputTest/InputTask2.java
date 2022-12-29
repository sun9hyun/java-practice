package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
//			3개의 정수 한번에 입력
//			정수의 곱 출력 	
		
		 int firstNumber = 0, secondNumber = 0, lastNumber = 0, result = 0; 
	      String numberMsg = "세정수 : "; // 변수 선언 
	      
	      Scanner sc = new Scanner(System.in); //입력 클래스 
	      
	      System.out.print(numberMsg);// 출력
	      
	      firstNumber = Integer.parseInt(sc.next());
	      secondNumber = Integer.parseInt(sc.next());
	      lastNumber = Integer.parseInt(sc.next()); // 문자열을 정수형으로 변환 후 변수에 저장 
	      
	      result = firstNumber * secondNumber *lastNumber ;
	      
	      System.out.printf("%d * %d* %d = %d", firstNumber, secondNumber,lastNumber, result);
	      
	   }
	}
