package castingTest;

public class CastingTest1 {
	public static void main(String[] args) {
		
		System.out.println(11/9); // 정수 정수 정수
		System.out.println(11.0/9); // 실수 정수 실수
		
		System.out.println(11/(double)9); // 정수 실수 실수 
		System.out.println((int)8.43+2.59); // 정수 실수 실수
		System.out.println((int)(8.43+2.59)); // 정수 정수 정수 
		
		System.out.println((int)8.43+(int)2.59); // 정수 정수 정수 
		
	}
}
