package sub1;

import sub1.Outer.Inner;

/*
 * ��¥ : 2020/11/16
 * �̸� : ����
 * ���� : ��øŬ����(����Ŭ����) �ǽ��ϱ� ���� p254
 */
public class InnerTest {

	public static void main(String[] args) {
		
		Outer out = new Outer(100);
		out.show();
		
		
		Inner inn = out.new Inner(200);
		inn.show();
	}
}
