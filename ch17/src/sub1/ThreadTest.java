package sub1;
/*
 * ��¥ : 2020/11/19
 * �̸� : ����
 * ���� : ������(Thread) �ǽ��ϱ� ���� p462
 * 
 * Thread
 * - �ϳ��� ���α׷�(���μ���) �ȿ��� ����Ǵ� ���� �帧
 * - Thread Ŭ������ ��ӹ޾� Start()�� ���꽺���� ����
 * 
 */
public class ThreadTest {

	public static void main(String[] args) {
		
		SubTread str1 = new SubTread("����1");
		SubTread str2 = new SubTread("����2");
		
		
		// �񵿱�(Asyncronize) ������� ���� 
		str1.start();
		str2.start();
	
		for(int i=1; i<=10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("���� ������ ����...");
			
		}
		
		System.out.println("���� ������ ����...");
		
	
		
	}
}
