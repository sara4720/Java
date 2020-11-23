package sub2;

import java.util.Arrays;
import java.util.List;

/*
 * ��¥ : 2020/11/23
 * �̸� : ����
 * ���� : ��Ʈ�� ���͸� �ǽ��ϱ� ���� p434
 */
public class FilterStreamTest {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("������","������","������","�̼���","������");
		
		// �ߺ�����
		System.out.println("----------------------------------------------------------");
		names.stream().distinct().forEach((name)->System.out.println("name : "+name));
		
		// �����ϱ�
		System.out.println("----------------------------------------------------------");
		names.stream().sorted().forEach((name)->System.out.println("name : "+name));	
		
		// �达 ���� ���
		System.out.println("----------------------------------------------------------");
		names.stream().filter((name)-> name.startsWith("��")).forEach((name)->System.out.println("name : "+name));	
	}

}
