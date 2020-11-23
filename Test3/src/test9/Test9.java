package test9;
/*
 * 날짜 : 2020/11/23
 * 이름 : 김사라
 * 내용 : 추상클래스, 다형성 연습문제
 */
public class Test9 {
	
	public static void main(String[] args) {
		
		Test9 here = new Test9();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
	}
	
	public void draw( Shape obj ) {
		obj.draw();
	}
}
