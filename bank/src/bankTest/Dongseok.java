package bankTest;


public class Dongseok extends Bank{ // Bank라는 부모클래스 상속 받음
   @Override
   public int showBalance() { //잔액 조회 메소드 입력벋을 값 없음
      setMoney(getMoney() / 2); 
      return super.showBalance();
   }
}