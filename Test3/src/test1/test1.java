package test1;
/*
 * 날짜: 2020/11/19
 * 이름 : 김사라
 * 내용 : 자바 클래스 연습문제
 */
public class test1 {

	private String name;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
	    test1 obj = new test1();
		obj.setName("홍길동");
		
		System.out.println(obj.getName());
	}
}
