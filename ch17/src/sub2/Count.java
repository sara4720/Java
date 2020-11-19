package sub2;

public class Count {

	private int num;
	
	public int getNum() {
		return num;
	}
	
	
	//동기화블럭 선언으로 스레드간 경험을 막는다.
	public synchronized void setNum() {
		num++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
