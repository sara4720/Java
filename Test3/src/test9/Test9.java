package test9;
/*
 * ��¥ : 2020/11/23
 * �̸� : ����
 * ���� : �߻�Ŭ����, ������ ��������
 */
public class Test9 {
	
	public static void main(String[] args) {
		
		Test9 here = new Test9();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
	}
	
	public void draw( Shape obj ) {
		obj.draw();
	}
}
