package threadTest;

public class Thread1 extends Thread{ //Thread1은 Thread를 상속받음 
   
   public String data; //변수 선언 
   
   public Thread1() {;} //기본생성자 선언
   
   public Thread1(String data) {
      super();
      this.data = data;
   }

   @Override
   public void run() {
      for (int i = 0; i < 10; i++) {
         System.out.println(data);
         try {Thread.sleep(1000);} catch (InterruptedException e) {;}
      }
   }
}










