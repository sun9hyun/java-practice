package controlTest;

import java.util.Scanner;

public class DowhileTest {
	public static void main(String[] args) {
		
		String msg = "1.통신요금 조회\n2.번호이동\n3.분실신고\n0.상담원 연결"; // 메세지 
		
		Scanner sc = new Scanner(System.in); // 입력 클래스
		int choice =0; // choice 변수 선언 
		
		do {
			System.out.println(msg);
			choice = sc.nextInt();
			
		}while(choice !=0); // 0이아니면 while문 반복 0이면 반복문 빠져나옴 
		
		}
	
	
} 

