package sub1;
/*
 * ��¥: 2020/11/05
 * �̸�: ����
 * ����: �޼���  �ǽ��ϱ� ���� p152
 * 
 * Method(�Լ�)
 * - �Ϸ��� �ڵ� ������ ���ȭ ��Ų ��
 * - ����(define)�� �޼��带 ȣ��(call)�ؼ� ����
 */

public class MethodTedst {
	public static void main(String[] args) {
	  
		// f �޼��� ȣ��(����)
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println("y1 : "+y1);
		System.out.println("y2 : "+y2);
		System.out.println("y3 : "+y3);
		
		
		// add �޼��� ȣ��(����)
		int z1 = add(1,2);
		int z2 = add(2,3);
		int z3 = add(3,4);
		
		System.out.println("z1 : "+z1);
		System.out.println("z2 : "+z2);
		System.out.println("z3 : "+z3);
		 
		
		// sub �޼ҵ� ȣ��(����)
		int r1 = sub(1,2);
		int r2 = sub(2,3);
		int r3 = sub(3,5);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		
		
		// sum �޼ҵ� ȣ��(����)
		int result1 = sum(1,10);
		int result2 = sum(1,100);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		
	} // main ��
	
	// f �޼��� ����
	public static int f(int x) {
		int y = 2 * x + 3;
		return y;
		
	}
	
	// add �޼��� ����
	public static int add(int x, int y) {
		int z = x + y;
		return z;
		
	}
	// sub �޼��� ����
	public static int sub(int x, int y) {
		int result = x - y;
		return result;

	}
	// sum �޼��� ����
	public static int sum(int a, int b) {
		
		int sum = 0;
		
		for(int k = a; k<=b; k++) {
			sum +=k;
		} 
		
		return sum;
	}
	
	
}
