package sub2;
/*
 * ��¥ : 2020/11/09
 * �̸� : ����
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ� ���� p148
 */

public class ClassTest {

	public static void main(String[] args) {
	
		// �������� ��ü(instance)���� �� �ʱ�ȭ
		Account kb = new Account("��������", "121-11-22222", "������",  10000);
		
		
		// �������� ��ü Ȱ���ϱ�
		kb.deposit(15000);                // �Ա�
		// kb.money++;                    // ĸ��ȭ �������� ����ڵ� ����
		kb.withdraw(5000);                // ���
		kb.show();                        // ���� �ܾ�
	
		
		
		// �츮���� ��ü(instance) ���� �� �ʱ�ȭ
		Account wr = new Account("�츮����","22-111-3333", "������", 5000 );

		
		// �츮���� ��ü Ȱ���ϱ�
		wr.deposit(10000);
		wr.withdraw(7000);
		wr.show();
		
		

	}
}
