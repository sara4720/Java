package sub2;
/*
 * ��¥ : 2020/11/18
 * �̸� : ����
 * ���� : ���׸� Ŭ���� �ǽ��ϱ� ���� p386
 */
public class MultiGenericTest {

	public static void main(String[] args) {
		
		
		TV tv = new TV("LG �÷���");
		SmartPhone iphone = new SmartPhone("������ 12");
		
		Product<TV, Integer> p1 = new Product<>(tv, 1000000);
		Product<SmartPhone, String> p2 = new Product<>(iphone, "iphone 12s");
		
		p1.show();		
		p2.show();		
		
		
		
		
		
		
	}
}
