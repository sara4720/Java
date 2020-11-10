package sub2;
/*
 * ��¥: 2020/11/04
 * �̸�: ����
 * ����: �ݺ��� While �ǽ��ϱ� ���� p92
 * 
 */
public class WhileTest {
	
	public static void main(String[] args) {
		
		// 1~10���� ��
		
		int k = 1;
		int sum = 0; 
		
		while (k<=10) {
			sum += k;
			k++;
		}

		System.out.println("1���� 10���� �� : " +sum);
		
		
		// do ~ while  : ���� 1���� ������ �����ϴ� �ݺ��� (while �տ� do�� �ֱ� ����
		
		int eSum = 0;
		int i = 1;
		
		do{
			if(i % 2 == 0) {
				eSum += i;
				}
		i++;
		} while(i<=10);
		
		System.out.println("1���� 10���� �� : " +eSum);
		
		
		
		// break : ���ϴ� ������ �������� �� break�� ���� Ż��
		
		int num = 1;
		
		while(true) {
			
			num++;
			
			if(num % 5 == 0 && num % 7 == 0) {
				break;
			}
		}
		
		System.out.println("5�� 7�� �ּҰ����: "+num);
		
		
		// continue  : �ݺ����� ������ �̵� (�ٽ� ���ǹ����� ���ư�)
		
		int total = 0;

		for(int j=1; j<= 10; j++) {
			
			if(j%2==1) {
				// j�� Ȧ���̸� �ݺ����� ������ �̵�, �Ʒ��� �������(total += j;) ���� �̵����� ����.
				continue;
			}
			total += j;			
		}
		
		System.out.println("1���� 10�� ¦�� �� : "+total);
		
		
		
		
		
		
	}

}
