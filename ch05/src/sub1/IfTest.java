package sub1;

import java.util.Scanner;

/*
 *  ��¥: 2020/11/03
 *  �̸�: ����
 *  ����: if ���ǹ� �ǽ��ϱ� ���� p79
 */
public class IfTest {
	
	public static void main(String[] args) {
		
		// if
		int num1 = 1;
		int num2 = 2;
		
		if(num1 < num2) {
			System.out.println("num1�� nu2���� �۴�.");
		}
		
		if(num1 <1) {
			System.out.println("num1�� 1���� ũ��."); // num1 �� 1���� ���� �ʱ� ������ ������� �ʴ´�.
		}
		
		if(num1 > 0) {                                                  // ���ǹ� 1��
			if(num2 > 1) {
				System.out.println("num1�� ���� ũ�� num2�� 1���� ũ��"); // ���ǹ� 2�� (���ǹ� 1���� ���̸� ���ǹ� 2������, �����̸� �Ѿ)
				
			}
		}
		if(num1 >0 && num2 >1) {
			System.out.println("num1�� ���� ũ�� num2�� 1���� ũ��");
		}
		
		// if ~ else
		int var1 = 1; // �����ϸ鼭 �ʱ�ȭ ����
		int var2 = 2;
		
		if(var1 > var2) {
			System.out.println("var1�� var2���� ũ��."); // if���� �����̸� else�� �Ѿ��
		
		} else {
			System.out.println("var1�� var2���� �۴�.");
		
		}
		
		
		// if ~ else if ~ else
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		if(n1 > n2) {                               // ���� 1
			System.out.println("n1�� n2���� ũ��.");
		} else if(n2 > n3) {                        // ���� 2
			System.out.println("n2�� n3���� ũ��.");
		} else if(n3 > n4) {                        // ���� 3
			System.out.println("n3�� n4���� ũ��.");
		} else {
			System.out.println("n4�� ���� ũ��.");     // ���� 1, 2, 3 �� �� �����ϋ� ����
		}
		
		// ��������
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		
		System.out.println("�Է� ���� : "+score);
		
		if(score >= 90 && score <= 100) {
			System.out.println("A�Դϴ�.");
		} else if(score < 90 && score >= 80){
			System.out.println("B�Դϴ�.");
		} else if(score < 80 && score >= 70){
			System.out.println("C�Դϴ�.");
		} else if (score < 70 && score >= 60){
			System.out.println("D�Դϴ�.");
		} else {
			System.out.println("F�Դϴ�.");
		}
		
	}

}
