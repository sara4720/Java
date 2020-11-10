package test04;

/*
 * 날짜 : 2020/11/05
 * 이름 : 김사라
 * 내용 : 자바 연산자 연습문제
 */
public class JavaTest4 {

	public static void main(String[] args) {
		
		int x = 4;
		int y = 2;
		int z;
	

		z= x+y;
		System.out.println("x + y = "+z);
		
		z= x-y;
		System.out.println("x - y = "+z);
		
		z= x*y;
		System.out.println("x * y = "+z);
		
		z= x/y;
		System.out.println("x / y = "+z);
		
		z= (x+y)*(x-y);
		System.out.println("(x + y) * ( x - y) = "+z);
		
		z= (x*y)+(x/y);
		System.out.println("( x * y) + ( x / y) = "+z);
		
		
		
	}
}
