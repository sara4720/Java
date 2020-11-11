package sub4;
/*
 * ��¥ : 2020/11/11
 * �̸� : ����
 * ���� : ������(Polymorphism) �ǽ��ϱ� ���� p205
 * 
 * 
 * ������
 *  - ��Ӱ��迡 �ִ� �θ�Ŭ������ ��ü���� ��ü�� ��ӹ޴� �ڽ�Ŭ������ ���ϴ� ����
 *  - �θ�Ŭ������ Ÿ������ ��ü�� �����ϴ� ��
 *  - ������ �������� ��ü�� Ÿ���� �����ϹǷμ� �ڵ��� �������� ����
 */
public class PolyTest {
	
	public static void main(String[] args) {
		
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a2.move();
		a3.move();
		
		a1.hunt();
		a2.hunt();
		a3.hunt();
		
	}

}
