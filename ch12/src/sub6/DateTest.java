package sub6;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 날짜 : 2020/11/17
 * 이름 : 김사라
 * 내용 : Date 클래스 실습하기 교재 p322
 */
public class DateTest {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("date :"+date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		String now = sdf.format(date);
		
		System.out.println(now);
		
		
		
		
		
		
	}
}
