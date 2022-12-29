package classTest;

import java.util.Scanner;

class SuperCar {
//   브랜드, 색상, 가격
   String brand;
   String color;
   int price; // 변수 선언
   
   boolean check; // 변수선언, boolean 사용으로 시동 꺼짐 켜짐 확인 

   public SuperCar() {} // 매개변수 갯수를 다르게 입력하여 동일 이름 메소드 생성 가능 
   
   public SuperCar(String brand, String color, int price) {
      this.brand = brand;
      this.color = color;
      this.price = price; // 필드에서 사용하기위해 메소드 생성 
   }
   
//   시동 켜기
//   시동의 상태를 확인하고 
//   시동이 꺼져있다면, "시동 켜기" 출력
//   이미 시동이 켜져있다면, "시동이 이미 켜져있습니다" 출력
   
   boolean engineStart() { // 시동이 켜졌을 때 메소드 생성
      if(!check) { 
         check = true; 
         return true;
      }
      return false; // boolean 기본 값 false 리턴값으로 반환
   }
   
//   시동 끄기
//   시동의 상태를 확인하고 
//   시동이 켜져있다면, "시동 끄기" 출력
//   이미 시동이 꺼져있다면, "시동이 이미 꺼져있습니다" 출력
   
   boolean engineStop() { //시동이 꺼졌을 때 메소드 생성 
      if(check) {
         check = false;
         return true;
      }
      return false;
   }
   
//   [심화]
//   시동을 켜기 위해서는 비밀번호 4자리를 입력해야 한다.
//   입력한 비밀번호가 3회 연속 실패하면 "경찰 출동" 메세지를 출력한다.
}

public class Shop {
   public static void main(String[] args) {
      SuperCar ferrari = new SuperCar(); // 객체화 진행 (구체화 시키기 위해)
      
      String msg = "1.시동켜기\n2.시동끄기"; // 메세지 선언
      Scanner sc = new Scanner(System.in); // 입력받는 부분 선언
      int choice = 0; // 변수 선언 
      
      do {
         System.out.println(msg); //시동켜기 끄기 메세지 출력
         choice = sc.nextInt(); // Scanner 클래스의 메소드 중에 정수 입력받아 choice 변수에 값을 넣는다.
         
         switch(choice) {
         case 1: // 시동 켜기
            if(ferrari.engineStart()) {
               System.out.println("시동 켜짐");
               break;
            }
            
            System.out.println("이미 시동이 켜져있습니다.");
            break;
         case 2:
            if(ferrari.engineStop()) {
               System.out.println("시동 꺼짐");
               break;
            }
            
            System.out.println("이미 시동이 꺼져있습니다.");
            break;
         }
      }while(ferrari.check); // 시동이 꺼졌을 때 빠져나옴 
   }
}

















