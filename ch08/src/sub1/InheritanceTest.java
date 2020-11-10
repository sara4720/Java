package sub1;
/*
 * 날짜 : 2020/11/10
 * 이름 : 김사라
 * 내용 : 클래스 상속 실습하기 교재 p196
 */
public class InheritanceTest {

	public static void main(String[] args) {
		
		StockAccount kb = new StockAccount("kb 증권","123-45-2323", "김유신", 1000000, "삼성전자", 10, 53000);
		
		kb.sell(5, 51000);
		kb.buy(10, 50100);
		
		kb.show();
	}
}
