package sub2;

import java.util.Arrays;
import java.util.List;

/*
 * 날짜 : 2020/11/23
 * 이름 : 김사라
 * 내용 : 스트림 필터링 실습하기 교재 p434
 */
public class FilterStreamTest {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("김유신","김춘추","강감찬","이순신","김유신");
		
		// 중복제거
		System.out.println("----------------------------------------------------------");
		names.stream().distinct().forEach((name)->System.out.println("name : "+name));
		
		// 정렬하기
		System.out.println("----------------------------------------------------------");
		names.stream().sorted().forEach((name)->System.out.println("name : "+name));	
		
		// 김씨 성만 출력
		System.out.println("----------------------------------------------------------");
		names.stream().filter((name)-> name.startsWith("김")).forEach((name)->System.out.println("name : "+name));	
	}

}
