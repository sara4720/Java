package sub4;
/*
 * ��¥ : 2020/11/11
 * �̸� : ����
 * ���� : ĳ����(��ü��ȯ) �ǽ��ϱ�
 */
public class CasingTest {

	public static void main(String[] args) {
		
		// ĳ����(����ȯ)
		int num1 = 1;
		double num2 = num1; 
		
		double var1 = 1.12;
		int var2 = (int)var1;
		
		// ��ĳ����(������ ����)
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		
		// �ٿ�ĳ����
		Tiger tiger = (Tiger)a1;
		Eagle eagle = (Eagle)a2;
		Shark shark = (Shark)a3;
		
		// instance of : ��������(��ü)�� ���� ��ü�� �����ϴ� ������
		
		if(a1 instanceof Tiger) {
			System.out.println("a1�� Tiger �Դϴ�.");
			
		} else if(a1 instanceof Eagle) {
			System.out.println("a1�� Eagle �Դϴ�.");
			
		} else if(a1 instanceof Shark) {
			System.out.println("a1�� Shark �Դϴ�.");
			
		}
		
	}
}
