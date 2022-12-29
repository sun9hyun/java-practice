package classTest;

class A{ // 클래스 선언 시 A(){} 자동 선언 됨 
	int data =100; //변수 선언 
	
	A(int data){ // A메소드 선언  
		this.data=data; //this는 접근한 주소의 객체 
	}
	void printData() { 
		System.out.println(data);
	}
}

public class ClassTest {
	public static void main(String[] args) {
		A a  = new A(10); // 객체 (a 는 주소)

		a.printData();
		
	}
}

