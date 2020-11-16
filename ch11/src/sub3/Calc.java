package sub3;

public class Calc {

	// �̱��� ��ü
	private static Calc instance = new Calc();
	
	private Calc() {}
	
	public static Calc getInstance() {
		return instance;
	}
	
	public int plus(int x, int y) {
		int z = x + y;
		return z;
	}
	public int minus(int x, int y) {
		int z = x - y;
		return z;
	}
	public int multi(int x, int y) {
		int z = x * y;
		return z;
	}
	
	// x �� y�� 0�� �ɶ� ������ �߻��ϱ� ������ ����ó�� �� (throws Exception�ϰ� main Ŭ���� ���� �߰�)
	public int div(int x, int y) throws Exception {
		
		if(y < 0) {
			Exception e = new Exception ("y�� ����̾�� �մϴ�.");
			throw e;
		} else if(y == 1){
			throw new Exception("y�� 1�� �Ǹ� �ȵ˴ϴ�.");
		}
		
		int z = x / y;
		
		return z;
	}
	
	
	}
