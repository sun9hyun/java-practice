package controlTest;

public class NestedForTest {
	public static void main(String[] args) {
		
		int count = 0; //  count 변수 선언 
		
		for (int i = 0; i < 10; i++) { 
			for (int j = 0; j < 3; j++) {
				System.out.println(i);
			}
		}
	}
}
