package methodTest;

public class MethodTask {
   
//   1~10까지 println()으로 출력하는 메소드
   void printFrom1To10() { // 값을 입력 받을 필요 없음 
      for (int i = 0; i < 10; i++) {
         System.out.println(i + 1); // 출력하는 메소드 return값 없음 
      }
   }
   
//   "홍길동"을 n번 println()으로 출력하는 메소드
   void printHong(int count){  //n번 이라는 값 입력 받아야함 
      for (int i = 0; i < count; i++) { 
         System.out.println("홍길동"); //출력하는 메소드 return값 없음 
      }
   }
   
//   이름을 n번 println()으로 출력하는 메소드
   void printName(String name, int count){ //이름이랑 n번값 입력 받아야됨
      for (int i = 0; i < count; i++) { // 0~count값 만큼 반복 
         System.out.println(name); // 출력하는 메소드 return값 없음 
      }
   }
   
//   세 정수의 뺄셈을 해주는 메소드
   int substract(int firstNumber, int middleNumber, int lastNumber){ // 세정수 입력 받아야함
      return firstNumber - middleNumber - lastNumber; // return값 정수 
   }
   
//   두 정수의 나눗셈을 해주는 메소드(몫과 나머지 둘 다)
   int[] divide(int num1, int num2){ // 두 정수 입력 받아야함
      int[] results = null; // 배열의 칸수와 값을 모름 
      
      if(num2 != 0) { // num2의 값이 0이 아니면 
         
         results[0] = num1 / num2; //몫
         results[1] = num1 % num2; // 나머지 
         
         results = new int[2]; // 2칸 배열 
      }
      return results; // 결과값 return 
   }
   
//   1~n까지의 합을 구해주는 메소드
   int getTotalFrom1(int end){ // n값 입력 받아야함
      int total = 0; // 전체 합 저장하는 total 변수 선언 
      for (int i = 0; i < end; i++) { // 0~end 까지 반복
         total += i + 1; 
      }
      return total; // total값 return 정수값
   }
   
//   홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
   int change(int number){ // 정수 입력 받아야함 1개
      return ++number; 
   }
   
//   문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
   String changeString(String string){ // 문자열 입력 받아야함
      String result = ""; // 변수 선언 
      
      for (int i = 0; i < string.length(); i++) { //0~문자열의 길이면큼 
         char c = string.charAt(i); // 입력받은 문자열의 문자열의 길이 번째 인덱스의 문자 추출 하는 값을 c 라는 변수에 저장 
         
         // 'A' : 65
         // 'Z' : 90
         if(c >= 65 && c <= 90) { //대문자
            result += (char)(c + 32);
            
         }else if(c >= 96 && c <= 122) { //소문자
            result += (char)(c - 32);
            
         }else {
            result += c;
         }
      }
      
      return result;
   }
   
   
//   문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
   
   int getCount(String string, char c){ // 문자열과 원하는 문자의 입력 받아야함 
      int count = 0; // 변수 선언 
      
      for (int i = 0; i < string.length(); i++) { //0~문자열의 길이만큼 
         if(string.charAt(i) == c) { // 입력 받은 문자열의 길이만큼의 인덱스의 문자와 원하는 문자와 같다면 
            count++;
         }
      }
      return count; // return값 정수
   }
   
//   5개의 정수를 입력받은 후 원하는 번째 값을 구해주는 메소드
   
   int getValue(int[] nums, int wantedNumber){ // 정수와 원하는 번째값 입력 받아야함
      return nums[wantedNumber - 1]; // 0부터 시작하기 때문에 -1해줘야함 
   }
   
   
//   한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024), indexOf() 사용
//   "공일이삼사오육칠팔구"
//   "일공이사"
//   "공일이삼사오육칠팔구".indexOf("일") --> 1
   
   int changeToInteger(String hangle){ //한글 입력 받아야함
      String hangleOriginal = "공일이삼사오육칠팔구", result = ""; // 변수선언 
      
      for (int i = 0; i < hangle.length(); i++) { //입력받은 문자열의 길이만큼
         result += hangleOriginal.indexOf(hangle.charAt(i)); // 입력받은 문자열의 길이의 인덱스의 문자를 추출하고 원하는 문자의 값 조회 
      }
      
      return Integer.parseInt(result); //문자열을 정수로 변환
   }
   
   
//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
   
      int[] getMaxAndMin(int[] nums){  // 정수 입력 
      
      int[] results = new int[2]; //2칸 배열 선언 
      
      results[0] = nums[0]; //최대값 (results 배열의 0번째 칸에 nums[0]배열 저장)
      results[1] = nums[0]; //최소값 (results 배열의 1번째 칸에 nums[0]배열 저장)
      
      for (int i = 1; i < nums.length; i++) { //0~배열의 길이만큼 
         if(results[0] < nums[i]) { results[0] = nums[i]; }  // num[i]가 results[0]보다 크면 최대값에 저장
         if(results[1] > nums[i]) { results[1] = nums[i]; } //  num[i]가 results[0]보다 작으면 최소값에 저장
      }
      
      return results;
   }
   
//   어려움★★★★★
//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void로 하되, 출력 없이 사용하는 부분에 결과를 전달한다)
//   매개변수는 2개 전달해야 한다.
//   예) getMaxAndMin();
//      여기서부터 최대값, 최소값 사용 가능
      
   void getMaxAndMin(int[] nums, int[] results) {
      results[0] = nums[0]; //최대값
      results[1] = nums[0]; //최소값
      
      for (int i = 1; i < nums.length; i++) {
         if(results[0] < nums[i]) { results[0] = nums[i]; }
         if(results[1] > nums[i]) { results[1] = nums[i]; }
      }

   
   public static void main(String[] args) {
      MethodTask mt = new MethodTask();
      
//      mt.printFrom1To10();
//      mt.printHong(10);
//      mt.printName("한동석", 10);
//      System.out.println(mt.substract(5, 4, 2));
//      int[] results = mt.divide(10, 3);
   
//      String msg = null;
//      msg = results == null ? "0으로 나눌 수 없습니다." : "몫 : " + results[0] + "\n나머지 : " + results[1];
//      System.out.println(msg);
      
//      1~n까지의 합을 구해주는 메소드
//      int getTotalFrom1(int end)
//      System.out.println(mt.getTotalFrom1(10));
      
//      홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
//      int change(int number)
//      boolean result = mt.change(11) % 2 == 0;
//      System.out.println(result ? "홀수에서 짝수로 바뀌었습니다." : "짝수에서 홀수로 바뀌었습니다.");
      
//      문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//      String changeString(String string)
//      System.out.println(mt.changeString("aPplE1234!@#$"));
   
//      문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
//      int getCount(String string, char c)
//      System.out.println(mt.getCount("apple", 'p') + "개");
//   }
//   }
//      5개의 정수를 입력받은 후 원하는 번째 값을 구해주는 메소드
//      int getValue(int[] nums, int wantedNumber)
//      int[] arData = {1, 2, 5, 7, 8};
//      System.out.println(mt.getValue(arData, 3));
      
//      한글을 정수로 바꿔주는 메소드
//      int changeToInteger(String hangle)
//      int result = mt.changeToInteger("삼공오이사");
//      System.out.println(result - 3);
      
//      5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
//      void getMaxAndMin(int[] nums, int[] results)
//      int[] arData = {1, 2, 5, 7, 8};
//      int[] results = new int[2];
//      
//      mt.getMaxAndMin(arData, results);
//      
//      System.out.println("최대값 : " + results[0]);
//      System.out.println("최소값 : " + results[1]);
//      
   }
}

      






