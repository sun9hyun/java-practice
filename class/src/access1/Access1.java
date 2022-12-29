package access1;

class F{}

public class Access1 {
   int data1 = 10; //default : 다른 패키지로 접근 불가
   public int data2 = 20; // 모든곳에서 접근 가능 
   protected int data3 = 30; // 다른 패키지로 접근 불가, 단 자식클래스는 가능 
   private int data4 = 40; // 다른  클래스에서 접근 불가 
   
   public Access1() {;} // 기본 생성자 선언 
   
   public Access1(int data4) {
      this.data4 = data4;
   }

   public int getData4() {
      return data4;
   }

   public void setData4(int data4) {
      this.data4 = data4;
   }
}