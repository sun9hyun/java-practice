package classTest;

class Car{
	
	String brand;
	String color;
	int price; // 변수만들기
	
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price; //alt + shift + o 
	}
	
	
	
	
public Car(String color) {
		this.brand = "자동차";
		this.color = color;
	}




// 메소드 같은 이름 가능 ( 구분점으로 구분함 구분점은 매개변수로 함 )
	
	void engineStart() {
		System.out.println(brand + " 시동켜기");
		
	}
	
	void engineStop() {
		System.out.println(brand + " 시동끄기");
	}
}

public class Road {
	//실행 프로그램을 만들어주는 메소드
		public static void main(String[] args) {
			Car momCar = new Car("Benz","Black",10_000);
			Car dadyCar = new Car("BMW","Blue",8_000);
			Car myCar = new Car("Red");
			
			momCar.engineStart();
			dadyCar.engineStart();
			myCar.engineStart();
			

		}

}
