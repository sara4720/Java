package sub1;
/*
 * ��¥ : 2020/11/23
 * �̸� : ����
 * ���� : ���ٽ� �ǽ��ϱ� ���� p402
 */
public class LamdaTest {
	
	public static void main(String[] args) {
		
		// ���ٽ� : �������̽��� Ȱ���� �ڵ���� ���� �͸��Լ�
		Lamda1 lam1 = () -> {System.out.println("Lamda1 ���ٽ� ���� ...");};
		lam1.method();
		
		Lamda2 lam2 = x -> System.out.println("Lamda2 ���ٽ� �Ű����� x : "+x);     // (), {} ���� ����
		lam2.method(10);
		
		Lamda3 lam3 = (x,y) -> x + y;
		int result = lam3.method(2,3);
		System.out.println("Lamda3 ���ٽ� ��� : "+result);

	}

}
