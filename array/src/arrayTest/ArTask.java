package arrayTest;

import java.util.Scanner;

public class ArTask {
   public static void main(String[] args) {
      
//      브론즈
//      1~10까지 배열에 담고 출력
//      int[] arData = new int[10]; // 10칸 배열 선언
//      
//      for (int i = 0; i < arData.length; i++) { 
//         arData[i] = i + 1;
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
//   }
//}
      
//      10~1까지 중 짝수만 배열에 담고 출력
//      int[] arData = new int[5]; //5칸 배열 선언 
      
//      10 8 6 4 2
//      
//      0 1 2 3 4  +1
//      --------------
//      1 2 3 4 5  *2
//      5 4 3 2 1  *2
//      --------------
//      2 4 6 8 10
//      10 8 6 4 2
      
//      for (int i = 0; i < arData.length; i++) { 
//         arData[i] = (5 - i) * 2; 
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
//   }
//}
      
//      1~100까지 배열에 담은 후 홀수만 출력
      
//      100칸 배열 선언
//      int[] arData = new int[100]; 
//      
//      for (int i = 0; i < arData.length; i++) { //배열의 길이만큼 반복(100번), 0 ~ 99
////         각 방에 1부터 100까지 순서대로 담는다.
//         arData[i] = i + 1;
//      }
//      
////      1 2 3 4 5 6 7 8 9 10
////   2
////      ----------------------
////      1 0 1 0 1 0 1 0 1 0
//      
//      for (int i = 0; i < arData.length; i++) {
////         if(arData[i] % 2 == 1) {
////            System.out.println(arData[i]);
////         }
//         
//         if(arData[i] % 2 == 0) { // 만약 값이 짝수라면 
//            continue; // 출력 하지 않고 반복문 계속 실행 
//         }
//         System.out.println(arData[i]); // 홀수 출력 
//      }
//   }
//}
      
      
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
	   
//      int[] arData = new int[100]; // 100칸 배열 선언
//      int total = 0; // 합을 담을 변수 선언 
//      
//      for (int i = 0; i < arData.length; i++) { // 배열 길이 만큼
//         arData[i] = i + 1; //1~100까지 변수에 담는다 
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         if(arData[i] % 2 == 1) { // 값이 홀수라면
//            continue; // 아래 코드로 가지 않고 반복문 
//         }
//         
//         total += arData[i]; // total변수에 arData[i]값의 합 저장 
//         
////         if(arData[i] % 2 == 0) {
////            total += arData[i];
////         }
//      }
//      System.out.println(total); // 출력 
//   }
//}

      
//      A~F까지 배열에 담고 출력
	   
//      char[] arData = new char[6]; // 문자형 변수 선언 
//      
//      for (int i = 0; i < arData.length; i++) {  // 0~배열의 길이만큼 
//         arData[i] = (char)(65 + i); //66 ~ 71 
//      }
//      
////      for(char i = 'A'; i < 'G'; i++) {
////         arData[i - 65] = i;
////      }
//      
//      for(char i = 65; i < 71; i++) {
//         arData[i - 65] = i;
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
//   }
//}
      
//      A~F까지 중 C 제외하고 배열에 담은 후 출력
//      char[] arData = new char[5]; //5칸 배열 생성
//      
//      for (int i = 0; i < arData.length; i++) { 
//         arData[i] = (char)(i > 1 ? 66 + i : 65 + i);
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
//   }
//}
      
//      골드
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
	   
//      int[] arData = new int[5]; // 5칸 베열 선언
//      
//      Scanner sc = new Scanner(System.in); //입력 클래스 
//      
//      String msg = "5개의 정수를 입력하세요."; //메세지 선언 
//      int max = 0, min = 0; // 변수 선언 
//      
//      System.out.println(msg); // 메세지 출력 
//      
//      for (int i = 0; i < arData.length; i++) { // 0~배열의 길이만큼
//         arData[i] = sc.nextInt(); // 문자열을 정수형으로 변환하여 배열에 저장 
//      }
//       
//      max = arData[0]; 
//      min = arData[0]; // 배열에 담겨있는 첫번째 값을 각각 max,min 변수에 저장 
//      
//      for (int i = 1; i < arData.length; i++) {
//         if(max < arData[i]) { max = arData[i]; } // max의 값이 arData[i]보다 작으면 배열의 값이 크기 때문에 max에 저장 
//         if(min > arData[i]) { min = arData[i]; } // min의 값이 arData[i]보다 크면 배열의 값이 작기 때문에 min에 저정 
//      }
//      
//      System.out.println("최대값 : " + max);
//      System.out.println("최소값 : " + min);
//   }
//}
      
      
//      다이아
//      사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
      
//      값도 모르고 칸도 아직 모름
      int[] arData = null; 
      
      Scanner sc = new Scanner(System.in); // 입력 클래스
      
      String countingMsg = "정수 개수 : ", msg = "번째 정수 : "; // 메세지 선언
      int total = 0; //결과값 변수 선언
      double avg = 0.0; //평균값 변수 선언 
      
      System.out.print(countingMsg); // 메세지 출력 
//      사용자가 입력한 정수만큼 칸 할당
      arData = new int[sc.nextInt()]; // 배열명 = new 자료형[칸수] -> 사용자의 입력 정수 만큼 칸 할당 
      
      for (int i = 0; i < arData.length; i++) { // 0~ 배열의 길이 만큼
         System.out.print(i + 1 + msg); 
//      사용자가 입력한 정수를 순서대로 넣는다.
         arData[i] = sc.nextInt();
      }
      
      for (int i = 0; i < arData.length; i++) {
         total += arData[i]; // total변수 값에 더한 값 저장 
      }
      
      avg = (double)total / arData.length; // avg변수 값에 평균 저장
      
//      소수점 둘 째자리까지 나누기 위해서, String 클래스의 format 메소드를 사용한다.
//      avg = Double.parseDouble(String.format("%.2f", avg));
      
      System.out.println(avg);
   }
}








