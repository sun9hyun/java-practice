package stringTest;

import java.util.Iterator;
import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
		//사용자에게 입력받은 문자열 중 소문자는 모두 대문자로 , 대문자는 모두 소문자로 변경한다.
//		65~90 (대문자)
//		96~122 (소문자)
		
//		Scanner sc = new Scanner(System.in); // 입력 클래스
//		String str = null, result = "" , msg = "문자열:"; // "" += 누적 연결시 사용 , null 대입 
//		
//		System.out.print(msg); //문자열: 메세지 출력
//		
//		str = sc.nextLine(); // 공백포함 입력한 문자열 값 str 변수에 저장 
//		
//		for (int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i); //문자추출 배열 길이 만큼 
//			if( c >= 65 && c <=90) { //대문자 
//				result += (char)(c + 32); 
////				result = result + (char)(c+32);
//			}else if ( c >= 96 && c <=122) { //소문자
//				result += (char)(c - 32);
//				
//			}else {
//				result +=c;
//			}
//		}System.out.println(result);
//	
//	}
//}


//      정수를 한글로 변경
//      예) 1024
//        -> 일공이사
//      charAt()
      
      
//      Scanner sc = new Scanner(System.in); // 입력 클래스 
//      
//      String msg = "정수 : ", hangle = "공일이삼사오육칠팔구", result = "", number = null; // 변수 선언 
//      
//      System.out.print(msg); // 메세지 출력
//      
//      number = sc.next(); //number 변수에 사용자가 입력한 입력 값 저장 
//      
//      for (int i = 0; i < number.length(); i++) { //0~문자열의 길이만큼 
//    	  
//         result += hangle.charAt(number.charAt(i) - 48); // 아스키 코드 48 = 0 
//      }
//      
//      System.out.println(result);
//      
////      number = sc.nextInt();
////      
////      while(number != 0) {
////         result = hangle.charAt(number % 10) + result;
////         number /= 10;
////      }
////      System.out.println(result);
//   }
//}

