package sub5;
/*
 * ��¥ : 2020/11/11
 * �̸� : ����
 * ���� : �߻�Ŭ���� �ǽ��ϱ� ���� p216
 * 
 * 
 * �߻�Ŭ����
 *  - �߻�޼��尡 ����� Ŭ����
 *  - �߻�Ŭ������ ��� �޾� ���ϼ� �ִ� ������ ���� Ŭ���� ����
 *  - �߻�Ŭ������ ��� �޴� �ڽ�Ŭ������ Ÿ�Լ����� �������� ����
 */
public class AbstractClassTest {

	public static void main(String[] args) {
		
		// �߻�Ŭ������ ���� ��ü������ �� �� ����.
		// Unit u = new Unit();
		
		Unit u1 = new Marine();
		Unit u2 = new Zealot();
		
		u1.move();
		u1.attack();
		
		u2.move();
		u2.attack();
	}
}
