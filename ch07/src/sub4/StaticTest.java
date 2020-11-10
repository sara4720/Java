package sub4;
/*
 * 날짜 : 2020/11/10
 * 이름 : 김사라
 * 내용 : 정적변수(=클래스변수), 정적메서드(=클래스메서드), 실습하기
 */
public class StaticTest {
	
	public static void main(String[] args) {
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		
		inc1.num1 = 1;
		inc2.num2 = 2;
		
		
		/*
		     정적변수(클래스변수), 정적메서드(클래스 메서드)는 이미 고정할당역영(Method Area)에
		     생성되어 있기 때문에 객체 생성없이 바로 참조할 수 있다.
		*/
		
		Increment.num2 += 3;
		Increment.add();
		
		Increment inc3 = new Increment();
		
		// 싱글톤 객체 교재 p185
		Calc cal = Calc.getInstance();
		
		int r1 = cal.plus(1,2);
		int r2 = cal.minus(2,3);
		int r3 = cal.multi(3,4);
		int r4 = cal.div(4,5);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		
		
		
	}

}
