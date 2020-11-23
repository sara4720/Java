package sub2;

import java.util.ArrayList;
import java.util.List;

import sub1.Student;

/*
 * 날짜 : 2020/11/23
 * 이름 : 김사라
 * 내용 : mapXXX() 스트림 실습하기 교재 p438
 */
public class MapStreamTest {
	
	public static void main(String[] args) {
	
		List<Student> sList = new ArrayList<>();
		
		sList.add(new Student("김유신", 86));
		sList.add(new Student("김춘추", 92));
		sList.add(new Student("장보고", 76));
		
		sList.stream().map((std)->std.getName()).forEach((name)->System.out.println(name));
		sList.stream().mapToInt((std)->std.getScore()).forEach((score)->System.out.println(score));		
		
	}
}