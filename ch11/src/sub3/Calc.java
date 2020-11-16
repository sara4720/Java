package sub3;

public class Calc {

	// 싱글톤 객체
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
	
	// x 나 y는 0이 될때 오류가 발생하기 때문에 예외처리 함 (throws Exception하고 main 클래스 가서 추가)
	public int div(int x, int y) throws Exception {
		
		if(y < 0) {
			Exception e = new Exception ("y는 양수이어야 합니다.");
			throw e;
		} else if(y == 1){
			throw new Exception("y는 1이 되면 안됩니다.");
		}
		
		int z = x / y;
		
		return z;
	}
	
	
	}
