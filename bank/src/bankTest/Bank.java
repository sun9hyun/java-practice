package bankTest;

public class Bank { // 부모클래스 
//   은행이 3개, 각 은행별 고객 100명씩 유치 가능
   public static Bank[][] arrBank = new Bank[3][100];
//   은행별 가입 회원 수
   public static int[] arCount = new int[3];
   
   private String name; // 이름
   private String account; // 계좌번호
   private String phoneNumber; // 핸드폰번호
   private String password; // 비밀번호
   private int money; //돈 
   
   public Bank() {;} // 기본생성자 선언

   public Bank(String name, String account, String phoneNumber, String password, int money) {
      this.name = name;
      this.account = account;
      this.phoneNumber = phoneNumber;
      this.password = password;
      this.money = money;
   }

 
   
//   static을 붙여서 선언한 메소드
//   객체화 없이 사용해야 할 때가 있기 때문
//   객체화 없이 사용하면 편하기 때문
   
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAccount() {
	return account;
}

public void setAccount(String account) {
	this.account = account;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public int getMoney() {
	return money;
}

public void setMoney(int money) {
	this.money = money; // getter ( 변수 값을 가져오는 메소드) 와 setter ( 변수 값을 설정하는 메소드 ) 선언  
}

//   계좌번호 중복검사
//   외부에서 생성된 계좌번호를 전달받는다.

   public static Bank checkAccount(String account) { // 계좌번호를 입력받는 static 메소드 선언 
      Bank bank = null; //변수 선언  
      for (int i = 0; i < arrBank.length; i++) { // 은행 수 만큼 반복
    	  
         int j = 0;// for문 영역 밖에서 사용하기 위해 이 곳에 선언
         
         for (j = 0; j < arCount[i]; j++) { // 각 은행별 가입된 회원 수 만큼 반복
            if(arrBank[i][j].account.equals(account)) { //각 회원들의 계좌번호와 생성된 계좌번호를 비교한다.
               //만약 일치하는 계좌번호가 있다면 해당 객체를 bank에 담아준다.
               bank = arrBank[i][j];
               //더 이상 반복을 진행할 필요가 없다.
               break;
            }
         }
//         위에서 강제로 break를 했다면 j가 arCount[i]까지 증가하지 못하기 때문에
//         위에서 break 후 밖에 있는 for문도 break 해준다.
         if(j != arCount[i]) {break;}
      }
      return bank;
   }
//   핸드폰 번호 검사
   
   public static Bank checkPhoneNumber(String phoneNumber) {
      Bank bank = null;
      
      for (int i = 0; i < arrBank.length; i++) { // 은행 수 만큼 반복
         int j = 0;
         
         for (j = 0; j < arCount[i]; j++) { // 각 은행별 가입된 회원 수만큼 반복
        	 
            if(arrBank[i][j].phoneNumber.equals(phoneNumber)) { // 각 회원들의 핸드폰 번호와 입력한 핸드폰 번호를 비교한다.
               bank = arrBank[i][j]; // 일치하면 bank에 담아둔다.
               break;
            }
         }
         if(j != arCount[i]) {break;}
      }
      return bank;
   }
//   로그인
//   외부에서 입력받은 계좌번호와 비밀번호를 전달받는다.
   
   public static Bank login(String account, String password) { //사용자에게 계좌번호 비밀번호 전달받음.
	   
//      계좌번호는 checkAccount에 전달한다.
//      1) 계좌가 있다면 해당 회원의 전체 정보를 가져온다.
//      2) 계좌가 없다면 null을 가져온다.
      Bank bank = checkAccount(account);
      
//      계좌번호가 존재한다면,
      if(bank != null) {
    	  
//         그 회원의 비밀번호와 입력받은 비밀번호를 비교한다.
         if(bank.password.equals(password)) {
        	 
//            로그인 성공 시, 회원의 전체 정보를 리턴한다.
            return bank;
         }
      }
//      로그인 실패 시 null을 리턴한다.
      return null;
   }
//   입금
   public void deposit(int money) {
      this.money += money;
   }
//   출금
   public void withdraw(int money) {
      this.money -= money;
   }
//   잔액조회
   public int showBalance() {
      return money;
   }
   
}











