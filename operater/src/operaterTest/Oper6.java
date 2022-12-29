package operaterTest;

public class Oper6 {
	public static void main(String[] args) {
		
	//1~10까지 총 4까지만 출력하기
//		for(int i = 0; i < 10 ; i ++ ) { // i 0~9까지 1씩 증가
//			System.out.println(i + 1); // /i+1 출력 
//			if ( i ==3) { // 만약 i가 3이라면 
//				break; // 반목문 끝 
//			}
//		}
//	}
//}
				
		
		//  1~10까지 중 3 제외하고 출력
		
		for ( int i = 0 ; i < 10 ; i ++) {
			if ( i == 2) { // i가 2면
				continue;} // 아래 코드 실행 하지 않고 다시 반복문 실행 
			System.out.println(i+1);
			
			}
		}
}
		
	

