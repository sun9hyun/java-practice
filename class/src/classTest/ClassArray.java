package classTest;


class Test {
		int data; // 변수 선언
		
		public Test() {;} //기본 생성자 선언 
		
		public Test(int data) {
			this.data = data;
		}

		void printData() {
			System.out.println(data);
		}
}	
		
		
		
public class ClassArray {
	public static void main(String[] args) {
		Test[] arTest = new Test[12];
		
		for (int i = 0; i < arTest.length; i++) {
			arTest[i] = new Test(i + 1);
		}
	
	arTest[11].printData();
}
}
