package operaterTest;

import java.util.Scanner;

public class Oper3 {
 public static void main(String[] args) {
//	사용자에게 키를 입력 받고 , 정수라면 정수로 출력
//	 실수라면 실수로 출력
//	 삼항 연산자 사용
	 
//	 정수인지 실수인지 : 전체에서 진수부를 뺐을 때 0인지 아닌지 검사 
//	 3.5 - 3 = 0.5 -> 실수 
//	 3.0 - 3 = 0.0 -> 정수
	 
	 double tall = 0.0; // 실수 타입으로 tall 변수 선언 
     String message = null, result = null; //null은 대입 , ""은 += 연결  
     boolean test = false; //변수 선언 
     
     Scanner sc = new Scanner(System.in); ;// 입력 클래스 
     
     System.out.println("키를 입력하세요 : "); // 출력
     tall = sc.nextDouble(); // 문자열을 실수형으로 tall 변수에 저장 
     
//     정수-정수 = 정수
//     정수-실수 = 실수
//     실수-실수 = 정수 
     test = (int)tall - (double)tall == 0; 
     
     result = test ? "당신의 키는 " + (int)tall : "당신의 키는 " + (double)tall; // 정수값과 실수값을 빼줬을 때 0값이 나오면 정수값 출력 아니면 실수 값 출력 
     
     System.out.println(result); //result값 출력 
}
}
