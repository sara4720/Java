package sub1;
/*
 * ��¥ : 2020/11/17
 * �̸� : ����
 * ���� : �ڹ� API(����Ŭ����) �ǽ��ϱ�
 */
public class ObjectClassTest {

	public static void main(String[] args) {
		
		// �������� Ȱ��Ǵ� Object Ŭ���� ���� p284
		Object a1 = new Apple("�ѱ�", 3000);
		Object a2 = new Apple("�Ϻ�", 2500);
		Object b1 = new Banana("�븸", 2000);
		Object b2 = new Banana("�߱�", 1500);
		
		
		// toString() : ���� p290
		a1.toString();
		a2.toString();
		b1.toString();
		b2.toString();
		
		
	}
}
