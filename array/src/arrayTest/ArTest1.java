package arrayTest;

public class ArTest1 {
	public static void main(String[] args) {
		int[] arData = {2,4,5,6,8}; // 배열 선언 
		
//		System.out.println(arData[0]);
//		
//		System.out.println(arData[1]);
//		
//		System.out.println(arData[2]);
//		System.out.println(arData[1]);
		
		
		for (int i = 0; i < arData.length; i++) { // 0~배열의 길이 만큼 (5만큼)
			arData[i] = 5-i;//
			
			
		}
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		
		// 5,4,3,2,1을 넣고 출력 
				
		
		
	}
}
