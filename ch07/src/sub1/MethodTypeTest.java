package sub1;

/*
 * 날짜: 2020/11/05
 * 이름: 김사라
 * 내용: 메소드 리턴타입 실습하기 p155
 */

public class MethodTypeTest {
	
	public static void main(String[] args) {
		
		// type 1 메서드 호출

		double rs1 = type1(1.01);
		System.out.println("rs1 : "+rs1);

		
		// type 2 메서드 호출 --> return 값이 없으므로 대입 연산자 없음
		
		type2(true);
		type2(false);
		
		
		// type 3 메서드 호출 --> return 값이 없으므로 boolean(대입 연산자) 입력
		
		boolean rs2 = type3();
		System.out.println("rs: "+rs2);
		
		
		// type 4 메서드 호출
		type4();
		
		
		// 연습문제
		for(int i =2; i<=9; i++) {
			gugudan(i);
		}
		
		
		
	} // main 끝
	
	
	// type1 : 매개변수 O, 리턴 값 O  --> 리턴 값이 소수니 double
	
	public static double type1(double a) {
		double result = a + 3.14;
	
		return result;
	}
	
	
	
	// type2 : 매개변수 O, 리턴 값 X  --> 리턴 값이 없으니 void
	
	public static void type2(boolean isOk) {

		if(isOk) {
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다.");
		}
	}
	
	
	
	// type3 : 매개변수 X, 리턴 값 O

	public static boolean type3() {
		
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
	// type4 : 매개변수 X, 리턴 값 X --> 리턴 값이 없으니 void
	
	public static void type4() {
		System.out.println("type4 메서드 결과 : " +type1(0.12));
		
	}
	
	
	// 연습문제(구구단 메소드 정의)
	public static void gugudan(int num) {
		
		System.out.println(num + "단");

		for(int i=2; i<=9; i++) {
			int result = num * i;
			System.out.println(num +" X " + i + " = " +result);
			
			for(int j=1; j<=9; j++) {
				
			}
		}
	}
	


}
