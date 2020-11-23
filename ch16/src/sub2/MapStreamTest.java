package sub2;

import java.util.ArrayList;
import java.util.List;

import sub1.Student;

/*
 * ��¥ : 2020/11/23
 * �̸� : ����
 * ���� : mapXXX() ��Ʈ�� �ǽ��ϱ� ���� p438
 */
public class MapStreamTest {
	
	public static void main(String[] args) {
	
		List<Student> sList = new ArrayList<>();
		
		sList.add(new Student("������", 86));
		sList.add(new Student("������", 92));
		sList.add(new Student("�庸��", 76));
		
		sList.stream().map((std)->std.getName()).forEach((name)->System.out.println(name));
		sList.stream().mapToInt((std)->std.getScore()).forEach((score)->System.out.println(score));		
		
	}
}