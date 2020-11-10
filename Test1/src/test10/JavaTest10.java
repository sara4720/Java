package test10;

/*
 * 날짜 : 2020/11/05
 * 이름 : 김사라
 * 내용 : 자바 피보나치 수열 연습문제
 */
public class JavaTest10 {

	 public static void main(String[] args) {
		int n1 = 1;
		int n2 = 2;
		int n3 ;
		
		System.out.print(n1 + ", ");
		System.out.print(n2 + ", ");
		
		for(int i=1; i<=10; i++) {
			n3 = n1 + n2;              
			System.out.print(n3 + ", ");
			
			n1 = n2;                         // n1은 n2로 바뀜
			n2 = n3;                         // n2는 n3로 바뀜

			
		}
	}
}
