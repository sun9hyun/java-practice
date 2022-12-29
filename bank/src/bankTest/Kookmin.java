package bankTest;


public class Kookmin extends Bank{// Bank라는 부모클래스 상속 받음
   @Override
   public void withdraw(int money) { 
      money *= 1.5;
      super.withdraw(money);
   }
}