package sub3;

import sub3.CCC;

/*
 * ��¥ : 2020/11/11
 * �̸� : ����
 * ���� : �������̵�(������) �޼��� �ǽ��ϱ� ���� p203
 * 
 *  Override(������) �޼���
 *    - �θ�Ŭ������ ��� �޼��带 �ڽ�Ŭ�������� �ٽ� �����ϴ� �޼���
 *    - �ڽ�Ŭ�������� �ٽ� ������ �޼��尡 �θ�Ŭ������ �޼��带 ���� �����.
 *  
 */
public class OverrideTest {
	
	public static void main(String[] args) {
		
		CCC c = new CCC();
		
		c. method1();
		c. method2();
		c. method2(100);
		c. method3();
		c. method3(200);
		
		
		
		/*
		 final �ǽ�
		   - final ���� : ���  
		   - final �޼��� : �������̵� ����
		   - final Ŭ���� : ��� ����
		 */
		
		
		final int NUM = 1;
		
		// ������ final �������� ����� �����.

		
	}

}
