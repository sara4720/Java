package sub1;

/*
 * ��¥: 2020/11/05
 * �̸�: ����
 * ����: �޼��� ��������� ���� �ǽ��ϱ� p159
 */
public class MethodStackTest {
	
	// �������� : Ŭ�������� ������ ����
	int num = 1; 

	public static void main(String[] args) {
		
		// �������� : �޼��忡�� ������ ����, �޼��尡 ����Ǹ� �޸𸮿��� ���ŵ�.
		int result = 0;
		int start = 1;
		int end = 10;
		
		result = sum(start,end);
		
		System.out.println("��� : "+result);
		
		
	} // main ��
	
	public static int sum(int s, int e) {
		 // �������� 
		int sum =  0;
		
		for(int k= s; k<=e; k++) {
			sum += k;
		}
		
		return sum;
	}
	
	
}
