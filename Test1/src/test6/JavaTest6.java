package test6;

import java.util.Scanner;

/*
  * ��¥ : 2020/11/05
  * �̸� : ����
  * ���� : �ڹ� ���ǹ� ��������
  */
public class JavaTest6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" ���� �Է� : ");
		int score = sc.nextInt();
		
		System.out.println("�Է��� ������ " +score+"�Դϴ�.");
		
		switch(score/10) {
		case 10:
		case 9: 
			System.out.println("����� A�Դϴ�.");
			break;
		case 8: 
			System.out.println("����� B�Դϴ�.");
			break;
		case 7: 
			System.out.println("����� C�Դϴ�.");
			break;
		case 6: 
			System.out.println("����� D�Դϴ�.");
			break;
		default: 
			System.out.println("����� F�Դϴ�.");
		}
	}

}
