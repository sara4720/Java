package sub4;
/*
 * ��¥ : 2020/11/11
 * �̸� : ����
 * ���� : ������ Ȱ�� �ǽ��ϱ�
 */
public class PolyUsingTest {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		Shark shark = new Shark();
		
		// �������� �̿��ϳ� ��ü�迭
		Animal animal[]= {tiger, eagle, shark};
		
		animal[0].move();
		animal[0].hunt();
 
		animal[1].move();
		animal[1].hunt();
		
		animal[2].move();
		animal[2].hunt();

	}
	
}
