package sub2;

public class Account {
	
	// ���� �Ӽ� : �������(field)�� ������ ĸ��ȭ(private ���� + ������ ����)�� �����ؾ� �Ѵ�.
	
	private String bank;       //public �ݴ�
	private String id; 
	private String name;
    private int money;
	
	// ������(constructor) ���� : Ŭ������ ��������� �ʱ�ȭ
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	// ���� ��� : ��� �޼���� ���� (����� �ϴ°��� ��ȣ)
	
	public void deposit(int _money){  // int _money ���� (����� �� ������ �������ַ���)
		money += _money;
	}
	public void withdraw(int _money){
		money -= _money;
	}
	public void show(){
		System.out.println("======================");
		System.out.println("����� : "+bank);
		System.out.println("���¹�ȣ : "+id);
		System.out.println("�Ա��� : "+name);
		System.out.println("�����ܾ� : "+money);
		
	}
	

}
