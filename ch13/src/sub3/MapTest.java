package sub3;

import java.util.HashMap;
import java.util.Map;

import sub1.Apple;

/*
 * ��¥ : 2020/11/18
 * �̸� : ����
 * ���� : Collection Map �ǽ��ϱ� ���� p372
 */
public class MapTest {

	public static void main(String[] args) {
		
		// Map ������ ������ ����
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(101,"������");
		map1.put(102,"������");
		map1.put(103,"�庸��");
		map1.put(104,"������");
		map1.put(105,"�̼���");
		
		// Map ������ ����
		System.out.println("map1 ������ ���� : "+map1.size());
		
		// Map ������ ���
		System.out.println("map1 101�� ������ : "+map1.get(101));
		System.out.println("map1 102�� ������ : "+map1.get(102));
		System.out.println("map1 103�� ������ : "+map1.get(103));
		
		
		// ��� Map ������ ������ ���� 
		Map<String, Apple> map2 = new HashMap<>();
		map2.put("kor",new Apple("�ѱ�",3000));
		map2.put("usa",new Apple("�̱�",2500));
		map2.put("jpn",new Apple("�Ϻ�",2000));
		
		
		// �ѱ���� ���
		map2.get("kor").show();
		

		// �̱���� ���
		map2.get("usa").show();
		

		// �Ϻ���� ���
		map2.get("jpn").show();
	}
}
