package sub1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * ��¥ : 2020/11/23
 * �̸� : ����
 * ���� : �÷��� ��Ʈ�� �ǽ��ϱ� ���� p420
 * 
 * ��Ʈ��(Stream)
 * - Java8 ���Ŀ� �߰��� �÷��� API(���)���� I/0 ��Ʈ���� �ٸ���
 * - �迭�̳� Collection�� ���Ҹ� ���ٽ��� �̿��ؼ� ó���� �� �ִ� �ݺ���
 * - Stream�� �̿��ϸ� ����ó���� �����ϱ� ������ ��뷮�� ������ ó���� �� ���� ������ ��´�.
 */
public class StremTest {

	public static void main(String[] args) {
		
		String[] names = {"������","������","�庸��","������","�̼���"};
		
		// �ݺ����� �̿��� ���
		for(String name : names) {
			System.out.println("for - "
					+ ""
					+ "name: "+name);
		}
		
		// Stream�� �̿��� ���
		Stream<String> nameStream = Arrays.stream(names);
		nameStream.forEach(name -> System.out.println("stream - name : "+name ));
		
		
		// ����Ʈ ��Ʈ�� ����
		List<String> list = new ArrayList<>();
		list.add("������");
		list.add("������");
		list.add("�庸��");
		list.add("������");
		list.add("�̼���");
		
		// �ݺ��� ���
		for(String name : list) {
			System.out.println("list ���� : "+name);
		}
		
		// ��Ʈ�� ���
		Stream<String> listStream = list.stream();
		listStream.forEach((name) -> {System.out.println("list stream : "+name);});
		
		
		// Stream ���� ����
		Student std1 = new Student("������", 86);
		Student std2 = new Student("������", 92);
		Student std3 = new Student("�庸��", 76);
		
		List<Student> sList = new ArrayList<>();
		sList.add(std1);
		sList.add(std2);
		sList.add(std3);
		
		Stream<Student> sStream = sList.stream();
		sStream.forEach((std)-> {
			System.out.println("�л� : "+std.getName());
		});
	}
}
