package sub1;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2020/11/17
 * 이름 : 김사라
 * 내용 : Collection List 실습하기 교재 p348
 */
public class ListTest {
	
	public static void main(String[] args) {
		
		// 리스트 생성
		List<Integer> list1 = new ArrayList<>();
		
		// 리스트 데이터 저장
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.remove(2);
		list1.add(1,3);  // 1은 인덱스 번호, 3을 집어넣음
		
		
		// 리스트 출력
		for(int i=0; i<list1.size(); i++) {
			System.out.println("list1 데이터 : "+list1.get(i));
		}
		
		
		// 문자열 리스트 생성과 데이터 저장
		List<String> list2 = new ArrayList<>();
		list2.add("김유신"); 
		list2.add("김춘추"); 
		list2.add("장보고"); 
		list2.add("강감찬"); 
		list2.add("이순신"); 
		
		for(String person : list2) {
			System.out.println("person : "+person);
		}
		
		
		// 사과 리스트 생성과 데이터 저장

		Apple a3 = new Apple("중국",2000);
		
		List<Apple> list3 = new ArrayList<>();
		list3.add(new Apple("한국", 3000));
		list3.add(new Apple("일본",2500));
		list3.add(a3);
		
		
		// 한국사과 출력
		Apple koApple = list3.get(0);
		koApple.show();
		
		// 일본사과 출력
		list3.get(1).show();
		
		// 중국사과 출력
		list3.get(2).show();
		
		
		
		
		
	}

}
