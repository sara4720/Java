package sub1;
/*
 * 날짜 : 2020/11/23
 * 이름 : 김사라
 * 내용 : 람다식 실습하기 교재 p402
 */
public class LamdaTest {
	
	public static void main(String[] args) {
		
		// 람다식 : 인터페이스를 활용한 코드블럭을 갖는 익명함수
		Lamda1 lam1 = () -> {System.out.println("Lamda1 람다식 실행 ...");};
		lam1.method();
		
		Lamda2 lam2 = x -> System.out.println("Lamda2 람다식 매개변수 x : "+x);     // (), {} 생략 가능
		lam2.method(10);
		
		Lamda3 lam3 = (x,y) -> x + y;
		int result = lam3.method(2,3);
		System.out.println("Lamda3 람다식 결과 : "+result);

	}

}
