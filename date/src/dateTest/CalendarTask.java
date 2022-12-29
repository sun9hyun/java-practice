package dateTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTask {
	public static void main(String[] args) {
//		본인의 생년월일 출력
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar date = Calendar.getInstance();
		date.set(1997, 06, 18); // 7월이지만 월은 0부터 시작이기 때문에 -1 해줌 
		System.out.println(simpleDateFormat.format(date.getTime())); //date를 calendar타입으로 변경해주기 위해 getTime메소드 사용


	}
}
