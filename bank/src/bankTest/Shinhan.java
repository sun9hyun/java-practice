package bankTest;

public class Shinhan extends Bank{
	
   @Override
   public void deposit(int money) {// Bank라는 부모클래스 상속 받음
      money *= 0.5;
      super.deposit(money);
   }
}