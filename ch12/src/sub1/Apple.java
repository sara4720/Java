package sub1;

public class Apple {

	private String country;
	private int price;
	
	//  �����ε� ��ü ������ ���� ������
	public Apple() {
		this.country = "���ѹα�";
		this.price = 2000;
	}
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("������ : "+country);
		System.out.println("���� : "+price);
	}
	
	@Override
	public String toString() {
		show();
		return super.toString();
	}
}
