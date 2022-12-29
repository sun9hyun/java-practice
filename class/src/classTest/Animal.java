package classTest;

import java.util.Random;

public class Animal {

   String name;
   int age;
   String feed;
   int feedCount;
   int life; //이름,나이,먹이,먹이 수,생명 변수 선언
   
   public Animal() {;} // 기본 생성자 선언
   
   public Animal(String name, int age, String feed, int feedCount, int life) {
      this.name = name;
      this.age = age;
      this.feed = feed;
      this.feedCount = feedCount;
      this.life = life; //생성자 선언
   }

   void eat() { // 리턴 값 없는 메소드 선언
      feedCount--; //먹이 수 감소
      life++; // 생명 증가 
   }
   
   void sleep() {// 리턴 값 없는 메소드 선언
      life++; // 생명 증가 
   }
   
//   외부에서 모든 문제를 전달받는다.
//   전달받은 문제 중 랜덤한 한 개의 문제만 리턴한다.
   	  Quiz walk(Quiz[] quizes) { // quizes 배열의 값을 입력 받음
      life--; // 생명감소 
      
      Random r = new Random(); //변수가 r인 Random함수 선언
      
      Quiz quiz = null; //Quiz 타입인 quiz변수 선언 
      
      int[] percent = new int[10]; //int 타입의 배열 선언 (percent)로 
      int rating = 50; // 확률 50%
      
//      잭팟 문제, 확률은 10%
//      확률이 10단위라면 10칸 배열을, 1단위라면 100칸 배열을 선언한다.
//      int배열로 선언한 뒤 사용자가 원하는 확률 만큼 1로 값을 바꿔준다.
      
//      예) 30% 확률이라면 10칸 배열에 3개의 값만 1로 바꿔준다.
//      따라서 원하는 확률 / 10 을 하여 반복횟수를 결정해주고,
//      그 만큼 1이 들어가게 된다.
      
//      위의 배열이 완성되었으면 랜덤한 인덱스번호로 값에 접근하여
//      1이 나왔을 때에는 원하는 확률로 성공한 것이고,
//      0이 나왔을 때에는 실패한 것이다.
      
      for (int i = 0; i < rating / 10; i++) {
         percent[i] = 1;
      }
      
      if(percent[r.nextInt(percent.length)] == 1) {
         for (int i = 0; i < quizes.length; i++) {
            if(quizes[i].jackpot) {
               return quizes[i];
            }
         }
      }
      
      while(true) {
         quiz = quizes[r.nextInt(quizes.length)];
         if(!quiz.jackpot) {break;}
      }
      
      return quiz;
   }
}















