package sub1;

/*
 * ��¥ : 2020/11/05
 * �̸� : ����
 * ���� : �����ε� �޼ҵ� �ǽ��ϱ� ���� p162
 * 
 * 
 * 
 * Overload Method
 *  - �޼��� �̸��� �Ȱ��� �Ű������� ������ Ÿ������ �����ϴ� �޼���
 *  
 */

public class MethodOverloadTest {
	 
	public static void main(String[] args) {
		
		int r1 = add(1);
		System.out.println("r1 : "+r1);
		
		int r2 = add(1,2);
		System.out.println("r2: "+r2);
		
		String r3 = add("ȫ�浿");
		System.out.println("r3: "+r3);
	}
	
	public static int add(int a) {
		return a++;
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static String add(String name) {
		return name+"�� �ݰ����ϴ�.";
	}

}
