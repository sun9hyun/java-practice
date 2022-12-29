package inheritanceTest;

class Car{
//	브랜드,색상,가격
//	열쇠로 시동 킴 출력
//	열쇠로 시동 끔 출력 
	String brand;
	String color;
	int price;
	
	public Car() {;}
	
	
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	void On(){
		System.out.println("열쇠로 시동 킴");
	}
	
	void Off(){
		System.out.println("열쇠로 시동 끔");
	}
}

class  SuperCar extends Car{ // 부모의 기본 생성자가 있어야된다 ,
//	초기화 생성자 만들 시 기본 생성자 무조건 만들어야됨
	
//	모드
//	음성으로 시동 킴
//	음성으로 시동 끔
//	지붕 열기
//	지붕 닫기
	String mode;
	
	
//	자식 기본 생성자는 부모의 깁ㄴ 생성자를 호출한다.
//	부모에 기본 생성자가 없으면 자식의 기본 생성자는 오류가 발생한다.
	public SuperCar() {;}
	
	public SuperCar(String brand,String color,int price,String mode) {
		super(brand,color,price); // 부모의 생성자 중 3개의 값을 전달 받는 생성자 호출
		this.mode = mode;
	}
	
	void On(){
		super.On(); // 생성자가 아닌 값 
		System.out.println("음성으로 시동 킴");
	}
	
	public SuperCar(String mode) {
		super();
		this.mode = mode;
	}

	void Off() {
		super.Off();
		System.out.println("음성으로 시동 끔");
	}
	
	void Open(){
		System.out.println("지붕 열기");
	}
	void Close() {
		System.out.println("지붕 닫기");
	}
	
}


public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar();
		ferrari.Close();
	}
}
