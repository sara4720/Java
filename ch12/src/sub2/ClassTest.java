package sub2;

import sub1.Apple;

/*
 * ��¥ : 2020/11/17
 * �̸� : ����
 * ���� : Class Ŭ���� �ǽ��ϱ� ���� p295
 */
public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		//�����ε� ��ü
		Apple a1 = new Apple("�ѱ�",3000);
		
		a1.toString();
		
		//�����ε� ��ü
		Class object = Class.forName("sub1.Apple");
		Apple a2 = (Apple) object.newInstance();
		
		a2.toString();
	}
	
}
