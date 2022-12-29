package classTest;

public class Quiz {
//   문제, 정답, 먹이개수
   String question;
   String answer;
   int feedCount;
   boolean jackpot; //변수 선언
   
   
   public Quiz() {;} // 기본 생성자 선언 

   
   public Quiz(String question, String answer, int feedCount) {
      this.question = question;
      this.answer = answer;
      this.feedCount = feedCount; // 생성자  선언
   }

   public Quiz(String question, String answer, int feedCount, boolean jackpot) {
      this.question = question;
      this.answer = answer;
      this.feedCount = feedCount;
      this.jackpot = jackpot; // 생성자 선언
   }

}