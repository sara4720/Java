package sub1;

import java.util.Scanner;

/*
 *  날짜: 2020/11/03
 *  이름: 김사라
 *  내용: if 조건문 실습하기 교재 p79
 */
public class IfTest {
	
	public static void main(String[] args) {
		
		// if
		int num1 = 1;
		int num2 = 2;
		
		if(num1 < num2) {
			System.out.println("num1은 nu2보다 작다.");
		}
		
		if(num1 <1) {
			System.out.println("num1은 1보다 크다."); // num1 은 1보다 작지 않기 떄문에 실행되지 않는다.
		}
		
		if(num1 > 0) {                                                  // 조건문 1번
			if(num2 > 1) {
				System.out.println("num1은 보다 크고 num2는 1보다 크다"); // 조건문 2번 (조건문 1번이 참이면 조건문 2번으로, 거짓이면 넘어감)
				
			}
		}
		if(num1 >0 && num2 >1) {
			System.out.println("num1은 보다 크고 num2는 1보다 크다");
		}
		
		// if ~ else
		int var1 = 1; // 선언하면서 초기화 했음
		int var2 = 2;
		
		if(var1 > var2) {
			System.out.println("var1이 var2보다 크다."); // if절이 거짓이면 else로 넘어옴
		
		} else {
			System.out.println("var1이 var2보다 작다.");
		
		}
		
		
		// if ~ else if ~ else
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		if(n1 > n2) {                               // 조건 1
			System.out.println("n1은 n2보다 크다.");
		} else if(n2 > n3) {                        // 조건 2
			System.out.println("n2은 n3보다 크다.");
		} else if(n3 > n4) {                        // 조건 3
			System.out.println("n3은 n4보다 크다.");
		} else {
			System.out.println("n4가 가장 크다.");     // 조건 1, 2, 3 이 다 거짓일떄 실행
		}
		
		// 연습문제
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		System.out.println("입력 점수 : "+score);
		
		if(score >= 90 && score <= 100) {
			System.out.println("A입니다.");
		} else if(score < 90 && score >= 80){
			System.out.println("B입니다.");
		} else if(score < 80 && score >= 70){
			System.out.println("C입니다.");
		} else if (score < 70 && score >= 60){
			System.out.println("D입니다.");
		} else {
			System.out.println("F입니다.");
		}
		
	}

}
