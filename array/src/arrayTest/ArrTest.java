package arrayTest;

public class ArrTest {
	public static void main(String[] args) {
		int[][]  arrData = {{3,4,5,6},{8,9,0,9},{1,2,3,4}}; // 2차원 배열 선언 
		
//		int length = arrData.length * arrData[0].length; //행 길이 * 열 길이 
//		for (int i = 0; i < length; i++) {
//			System.out.println(arrData[i / 4][i % 4]); //0 ~ n까지의 값에서 나머지가 1이 되려면 n+1로 나눠주면 된다 
//		}
//	
		for (int i = 0; i < arrData.length; i++) { // 0~행의 길이 만큼
			for (int j = 0; j < arrData[1].length; j++) { // 0~열의 길이 만큼 
				System.out.println(arrData[i][j]);
			}
		}
//		System.out.println(arrData.length); //행의 길이
//		System.out.println(arrData[0].length); //열의 길이
		
		
	}
}
