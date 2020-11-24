package sub1;

import java.util.Scanner;

/*
 * 날짜 : 2020/11/24
 * 이름 : 김사라
 * 내용 : 입출력 스트림 실습하기 교재 p494
 */
public class IOTest {
	public static void main(String[] args) {
		
		// 시스템 기본 입력스트림
		Scanner scan = new Scanner(System.in);
		
		// 시스템 기본 출력스트림
		System.out.print("이름 입력 : ");
		
		String name = scan.nextLine();
		System.out.println("이름 : "+name);
	}
}
