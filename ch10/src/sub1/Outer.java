package sub1;

public class Outer {
	
	private int x;

	public Outer(int x) {
		this.x= x;
	}
	public void show() {
		System.out.println("Outer x : "+x );
	}
	
	
	// ��ø(����)Ŭ����
	public class Inner{
		private int x;
		
		public Inner(int x) {
			this.x=x;
		}
		public void show() {
			System.out.println("Inner x : "+x );
		}
	}
	
}
