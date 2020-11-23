package sub2;

import java.util.Arrays;
import java.util.List;

/* 
 * 날짜 : 2020/11/23
 * 이름 : 김사라
 * 내용 : flatMap() 스트림 실습하기 교재 p436
 */
public class FlatMapStreamTest {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("김유신,김춘추", "장보고,강감찬","이순신,안중근");
		
		System.out.println("-----------------------------");
		names.stream().forEach(name -> System.out.println("name :"+name));
		
		System.out.println("-----------------------------");
		names.stream().flatMap((name)->Arrays.stream(name.split(","))).forEach(name -> System.out.println("name :"+name));
	}
}
