package sub1;

/*
 * ��¥: 2020/11/05
 * �̸�: ����
 * ����: �޼ҵ� ����Ÿ�� �ǽ��ϱ� p155
 */

public class MethodTypeTest {
	
	public static void main(String[] args) {
		
		// type 1 �޼��� ȣ��

		double rs1 = type1(1.01);
		System.out.println("rs1 : "+rs1);

		
		// type 2 �޼��� ȣ�� --> return ���� �����Ƿ� ���� ������ ����
		
		type2(true);
		type2(false);
		
		
		// type 3 �޼��� ȣ�� --> return ���� �����Ƿ� boolean(���� ������) �Է�
		
		boolean rs2 = type3();
		System.out.println("rs: "+rs2);
		
		
		// type 4 �޼��� ȣ��
		type4();
		
		
		// ��������
		for(int i =2; i<=9; i++) {
			gugudan(i);
		}
		
		
		
	} // main ��
	
	
	// type1 : �Ű����� O, ���� �� O  --> ���� ���� �Ҽ��� double
	
	public static double type1(double a) {
		double result = a + 3.14;
	
		return result;
	}
	
	
	
	// type2 : �Ű����� O, ���� �� X  --> ���� ���� ������ void
	
	public static void type2(boolean isOk) {

		if(isOk) {
			System.out.println("�� �Դϴ�.");
		} else {
			System.out.println("���� �Դϴ�.");
		}
	}
	
	
	
	// type3 : �Ű����� X, ���� �� O

	public static boolean type3() {
		
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
	// type4 : �Ű����� X, ���� �� X --> ���� ���� ������ void
	
	public static void type4() {
		System.out.println("type4 �޼��� ��� : " +type1(0.12));
		
	}
	
	
	// ��������(������ �޼ҵ� ����)
	public static void gugudan(int num) {
		
		System.out.println(num + "��");

		for(int i=2; i<=9; i++) {
			int result = num * i;
			System.out.println(num +" X " + i + " = " +result);
			
			for(int j=1; j<=9; j++) {
				
			}
		}
	}
	


}
