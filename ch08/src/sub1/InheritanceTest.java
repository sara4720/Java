package sub1;
/*
 * ��¥ : 2020/11/10
 * �̸� : ����
 * ���� : Ŭ���� ��� �ǽ��ϱ� ���� p196
 */
public class InheritanceTest {

	public static void main(String[] args) {
		
		StockAccount kb = new StockAccount("kb ����","123-45-2323", "������", 1000000, "�Ｚ����", 10, 53000);
		
		kb.sell(5, 51000);
		kb.buy(10, 50100);
		
		kb.show();
	}
}
