package sub1;

import java.util.Scanner;

/*
 * ��¥: 2020/11/03
 * �̸�: ����
 * ����: ���ǹ� Switch �Ǽ��ϱ� ���� p86
 */
public class SwitchTest {
	
	public static void main(String[] args) {
		// ¦��, Ȧ�� �Ǻ��ϱ�
		int num = 4;
		int result = num & 2; 
		
		switch(result) {
		case 0 :
			System.out.println("num�� ¦�� �Դϴ�.");
			break;
			
		case 1 :
			System.out.println("num�� Ȧ�� �Դϴ�.");
			break ;
			
	    default : 
	    	break ;
		
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : "); // println ���� ln ��������.
		
		int score = sc. nextInt();
		System.out.println("�Է� ���� : " +score);
		
		int rs = score / 10;
		
		switch (rs) {
		case 10:
		case 9:
			System.out.println("A�Դϴ�.");
			break;
		case 8:
			System.out.println("B �Դϴ�.");
			break;
		case 7:
			System.out.println("C �Դϴ�.");
			break;
		case 6:
			System.out.println("D �Դϴ�.");
			break;
		default:
			System.out.println("F �Դϴ�.");
			break;
		}
		
	}

}
