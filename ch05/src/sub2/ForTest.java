package sub2;

/*
 * ��¥: 2020/11/03
 * �̸�: ����
 * ����: �ݺ��� for �ǽ��ϱ� ���� p90
 */
public class ForTest {
	
	public static void main(String[] args) {
		
		// for ����
		
		for(int i=1; i<=3 ; i++) {              //�ʱ��; ���ǽ�; ������ <-- �����ݷ����� ���� , 1�� �����ؼ� 3���� ����
			System.out.println("Hello Java!");
		}

		// 1���� 10���� ��
		
		int sum = 0; 
		
		for(int k=1; k<=10; k++) {
			sum += k;
			
		}
		System.out.println("1���� 10������ �� : "+sum);
	
		
		
		// 1���� 10���� ¦����
		
		int eSum = 0;
		
		for(int k=1; k<=10; k++) {
			if(k % 2 ==0) {                 // ¦��
			eSum += k;
			}
		}
		System.out.println("1���� 10���� ¦����: " +eSum);
		
		
		
		// for ��ø (2�� for��) 
		
		for(int a=1; a<=3; a++) {                          //1���� 3�� �ݺ���  -> 1,2,3
			System.out.println("a : "+a);
			
			for(int b=1; b<=5; b++) {                      //2���� 5�� �ݺ��� -> 1(1,2,3,4,5), 2(1,2,3,4,5), 3(1,2,3,4,5,) �̷�������
				System.out.println("b : "+ b);
				
			}
		}
		
		
		
		// ������ ���
		
		
		for(int x=2; x<=9; x++) {
			
			System.out.println(x + "��");
			
			for(int y=1; y<=9; y++) {
				
				int z= x*y;
				//System.out.println(x + "x" + y + "=" +z);
				System.out.printf("%d * %d = %d \n", x, y, z);        // c�� ��Ÿ�Ϸε� ������
			}
		}
		
		
		// ���ﰢ�� ��� - 1
		
		
		for(int start = 1; start <=10; start++) {
			for(int end=1; end<=start; end++) {
				System.out.print("��");
			}
			System.out.print("\n");
		}
		
		
		// ���ﰢ�� ��� - 2
		
		for(int a =1; a<=5; a++) {
			for(int b=1; b<=5-a; b++) {
				System.out.print("��");
			}
			for(int c = 1; c<=a; c++) {
				System.out.print("��");
			}
			System.out.print("\n");
	}
		
		
	}
}
