package synchronizedTest;

public class ATM implements Runnable { //ATM은 Runnable을 상속받음
	
	public int money; // 변수 선언 
	
	public ATM() { //기본 생성자 선언 
		this(10000); 
	}
	
	public ATM(int money) {
		super();
		this.money = money;
	}

	@Override
	public void run() { //run()메소드 재정의 , 멀티쓰레드 구현
		for (int i = 0; i < 5; i++) { // 5번 반복
		withdraw(1000); //1000원 출금하기 
		//Thread.sleep(300) 코드 실행시 작업이 종료하게 해주는 예외 처리문
		try {Thread.sleep(300);} catch (InterruptedException e) {;} 
		}
	}
	
	
	public /*synchronized*/ void withdraw(int money) { //출금 메소드 정의 
//		mutex : 동기화를 걸어줄 자원 객체 
//		synchronized (this) { //alt + shift + z 
			this.money -= money;
//		}
		
		System.out.println(Thread.currentThread().getName() + "이(가)" + money + "원 출급");
		System.out.println("현재 잔액 :" + this.money + "원");
	}
}
