package sub2;

public class Account {
	
	// 계좌 속성 : 멤버변수(field)는 무조건 캡슐화(private 선언 + 생성자 정의)을 적용해야 한다.
	
	private String bank;       //public 반대
	private String id; 
	private String name;
    private int money;
	
	// 생성자(constructor) 정의 : 클래스의 멤버변수를 초기화
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	// 계좌 기능 : 멤버 메서드로 선언 (동사로 하는것을 선호)
	
	public void deposit(int _money){  // int _money 선언 (언더바 한 이유는 구분해주려고)
		money += _money;
	}
	public void withdraw(int _money){
		money -= _money;
	}
	public void show(){
		System.out.println("======================");
		System.out.println("은행명 : "+bank);
		System.out.println("계좌번호 : "+id);
		System.out.println("입금주 : "+name);
		System.out.println("현재잔액 : "+money);
		
	}
	

}
