package test04;

/*
 * ��¥ : 2020/11/05
 * �̸� : ����
 * ���� : �ڹ� ������ ��������
 */
public class JavaTest4 {

	public static void main(String[] args) {
		
		int x = 4;
		int y = 2;
		int z;
	

		z= x+y;
		System.out.println("x + y = "+z);
		
		z= x-y;
		System.out.println("x - y = "+z);
		
		z= x*y;
		System.out.println("x * y = "+z);
		
		z= x/y;
		System.out.println("x / y = "+z);
		
		z= (x+y)*(x-y);
		System.out.println("(x + y) * ( x - y) = "+z);
		
		z= (x*y)+(x/y);
		System.out.println("( x * y) + ( x / y) = "+z);
		
		
		
	}
}
