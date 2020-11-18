package sub6;

import java.util.Calendar;

/*
 * 날짜 : 2020/11/17
 * 이름 : 김사라
 * 내용 : Calendar 클래스 실습하기 교재 p323
 */
public class CalenderTest {

	public static void main(String[] args) {
		
		
		// 싱글톤 객체 (ch07)
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d\n", year, month, date);
		System.out.printf("%d:%d:%d\n", hour, min, sec);
		
		
		
		
		
		
		
		
	}
}
