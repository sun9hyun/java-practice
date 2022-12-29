package synchronizedTest;

public class CU {
	public static void main(String[] args) {
		
	
	ATM atm = new ATM(); //ATM객체화(클래스 내에서 변수나 메소드로 사용 가능)
	
	Thread mom = new Thread(atm,"엄마"); 
	Thread son = new Thread(atm,"아들");
	
	mom.start();
	son.start();
}
}
