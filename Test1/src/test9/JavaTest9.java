package test9;

/*
 * ��¥ : 2020/11/05
 * �̸� : ����
 * ���� : �ڹ� ���̾Ƹ�� ��������
 */
public class JavaTest9 {
	
	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 1; i <=9; i++){
		
			if(i<=5)
				++count;                             // count �� ++�ϸ鼭 1�� �������
			else 
				--count;                             // 6��°�� ���Ӿ����� -- �� �ϸ鼭 �ϳ��� �ٿ���
			
			for(int j =1; j<=5-count; j++) {
				System.out.print(" .");
	}
			
			for(int k=1; k<=2*count-1;k++) {
				System.out.print("*");
			}

			System.out.print("\n");
	}
	
	
	

	}
}
