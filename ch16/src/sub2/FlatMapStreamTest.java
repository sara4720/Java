package sub2;

import java.util.Arrays;
import java.util.List;

/* 
 * ��¥ : 2020/11/23
 * �̸� : ����
 * ���� : flatMap() ��Ʈ�� �ǽ��ϱ� ���� p436
 */
public class FlatMapStreamTest {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("������,������", "�庸��,������","�̼���,���߱�");
		
		System.out.println("-----------------------------");
		names.stream().forEach(name -> System.out.println("name :"+name));
		
		System.out.println("-----------------------------");
		names.stream().flatMap((name)->Arrays.stream(name.split(","))).forEach(name -> System.out.println("name :"+name));
	}
}
