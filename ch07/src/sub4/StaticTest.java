package sub4;
/*
 * ��¥ : 2020/11/10
 * �̸� : ����
 * ���� : ��������(=Ŭ��������), �����޼���(=Ŭ�����޼���), �ǽ��ϱ�
 */
public class StaticTest {
	
	public static void main(String[] args) {
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		
		inc1.num1 = 1;
		inc2.num2 = 2;
		
		
		/*
		     ��������(Ŭ��������), �����޼���(Ŭ���� �޼���)�� �̹� �����Ҵ翪��(Method Area)��
		     �����Ǿ� �ֱ� ������ ��ü �������� �ٷ� ������ �� �ִ�.
		*/
		
		Increment.num2 += 3;
		Increment.add();
		
		Increment inc3 = new Increment();
		
		// �̱��� ��ü ���� p185
		Calc cal = Calc.getInstance();
		
		int r1 = cal.plus(1,2);
		int r2 = cal.minus(2,3);
		int r3 = cal.multi(3,4);
		int r4 = cal.div(4,5);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		
		
		
	}

}
