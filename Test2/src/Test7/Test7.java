package Test7;
/*
 * ��¥ : 2020/11/13
 * �̸� : ����
 * ���� : �ڹ� �ִ����� ��������
 */
public class Test7 {
	
	public static void main(String[] args) {
		System.out.println("1�� 5�� �ִ����� : "+gcd(1,5));
		System.out.println("3�� 6�� �ִ����� : "+gcd(3,6));
		System.out.println("12�� 18�� �ִ����� : "+gcd(12,18));
		System.out.println("60�� 24�� �ִ����� : "+gcd(60,24));
	}
	
	public static int gcd(int a, int b) {
		int temp = 0;
		if(a<b) {
			temp = a;
		} else {
			temp = b;
		}
		while (true) {
			if(a % temp ==0 && b % temp ==0) {
				break;
			}
			temp--;
		}
		return temp;
	}

}
