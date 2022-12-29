package collectionTest;

public class ForeachTest {
   public static void main(String[] args) {
      int[][] arrData = {{10, 30, 80}, {20, 40, 10}};
//      각 학생의 총점과 평균 출력
      int total = 0;
      double average = 0.0;
      
      
//  for( 자료형 변수명 : 컬렉션 ) 
//  변수로 컬렉션 내부의 요소를 하나씩 꺼내오면서 반복

      for (int[] arData : arrData) { //arrData안에 있는 요소를 반복
         total = 0; // 초기화 필요 
         for (int score : arData) { //arData안에 있는 요소 반복
            total += score; //score값 더한거 total에 저장
         }
         average = total / (double)arData.length; //더한 횟수 만큼 나눔
         average = Double.parseDouble(String.format("%.2f", average)); 
         
         System.out.println(total);
         System.out.println(average);
      }
      
   }
}
