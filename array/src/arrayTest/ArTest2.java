package arrayTest;

public class ArTest2 {
	public static void main(String[] args) {
		// 1~10 넣고 출력
		
		int[] arData = new int [10]; // 값은 모르나 몇칸인지는 알기 때문에 이렇게 배열 선언 
	
			for (int i = 0; i < arData.length; i++) { // 0~ 10
				arData[i] = i + 1; 
				
			}
			for (int i = 0; i < arData.length; i++) {
				System.out.println(arData[i]);
			}
		}
	}

