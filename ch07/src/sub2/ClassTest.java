package sub2;
/*
 * 날짜 : 2020/11/09
 * 이름 : 김사라
 * 내용 : 자바 클래스 실습하기 교재 p148
 */

public class ClassTest {

	public static void main(String[] args) {
	
		// 국민은행 객체(instance)생성 및 초기화
		Account kb = new Account("국민은행", "121-11-22222", "김유신",  10000);
		
		
		// 국민은행 객체 활용하기
		kb.deposit(15000);                // 입금
		// kb.money++;                    // 캡술화 적용으로 취약코드 예방
		kb.withdraw(5000);                // 출금
		kb.show();                        // 현재 잔액
	
		
		
		// 우리은행 객체(instance) 생성 및 초기화
		Account wr = new Account("우리은행","22-111-3333", "김춘추", 5000 );

		
		// 우리은행 객체 활용하기
		wr.deposit(10000);
		wr.withdraw(7000);
		wr.show();
		
		

	}
}
