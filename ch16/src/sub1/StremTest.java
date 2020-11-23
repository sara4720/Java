package sub1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * 날짜 : 2020/11/23
 * 이름 : 김사라
 * 내용 : 컬렉션 스트림 실습하기 교재 p420
 * 
 * 스트림(Stream)
 * - Java8 이후에 추가된 컬렉션 API(기능)으로 I/0 스트림과 다르다
 * - 배열이나 Collection의 원소를 람다식을 이용해서 처리할 수 있는 반복자
 * - Stream을 이용하면 병렬처리가 가능하기 때문에 대용량의 데이터 처리에 더 나은 성능을 얻는다.
 */
public class StremTest {

	public static void main(String[] args) {
		
		String[] names = {"김유신","김춘추","장보고","강감찬","이순신"};
		
		// 반복문을 이용한 출력
		for(String name : names) {
			System.out.println("for - "
					+ ""
					+ "name: "+name);
		}
		
		// Stream을 이용한 출력
		Stream<String> nameStream = Arrays.stream(names);
		nameStream.forEach(name -> System.out.println("stream - name : "+name ));
		
		
		// 리스트 스트림 예제
		List<String> list = new ArrayList<>();
		list.add("김유신");
		list.add("김춘추");
		list.add("장보고");
		list.add("강감찬");
		list.add("이순신");
		
		// 반복문 출력
		for(String name : list) {
			System.out.println("list 원소 : "+name);
		}
		
		// 스트림 출력
		Stream<String> listStream = list.stream();
		listStream.forEach((name) -> {System.out.println("list stream : "+name);});
		
		
		// Stream 응용 문제
		Student std1 = new Student("김유신", 86);
		Student std2 = new Student("김춘추", 92);
		Student std3 = new Student("장보고", 76);
		
		List<Student> sList = new ArrayList<>();
		sList.add(std1);
		sList.add(std2);
		sList.add(std3);
		
		Stream<Student> sStream = sList.stream();
		sStream.forEach((std)-> {
			System.out.println("학생 : "+std.getName());
		});
	}
}
