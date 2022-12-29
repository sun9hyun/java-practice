package operaterTest;

import java.util.Scanner;

public class Oper4 {
   public static void main(String[] args) {
//      심리 테스트
      /*
       * Q. 당신이 좋아하는 색을 선택하세요.
       * 1. 빨간색
       * 2. 노란색
       * 3. 검은색
       * 4. 흰색
       * 
       * 빨간색 : 불같고 열정적이고 적극적이다.
       * 노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
       * 검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
       * 흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
       * 
       */
      
      String message = "Q. 당신이 좋아하는 색을 선택하세요.";
      String choiceMessage = "1. 빨간색\n2.노란색\n3.검은색\n4.흰색";
      String redMessage = "불같고 열정적이고 적극적이다."; 
      String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다."; 
      String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다."; 
      String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
      String errorMessage = "다시 입력해주세요.";
      String resultMessage = null; // 메세지 변수 선언 result 메세지는 대입 
      
      int choice = 0; // choice 변수 선언  
      Scanner sc = new Scanner(System.in); // 입력 클래스 
      
      System.out.println(message + "\n" + choiceMessage);  //출력 
      choice = sc.nextInt(); // 문자열을 정수로 바꾸고 choice 변수에 저장  
      
      resultMessage = choice == 1 ? redMessage : 
         choice == 2 ? yellowMessage :
            choice == 3 ? blackMessage : 
               choice == 4 ? whiteMessage : errorMessage; //1~4번 선택 및 다른 번호 눌렀을 때 메세지를 담는 resultMessage변수 
      
      System.out.println(resultMessage); // 출력 
   }
}

















