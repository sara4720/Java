package sub1;

import java.util.Scanner;

/*
 * ��¥ : 2020/11/24
 * �̸� : ����
 * ���� : ����� ��Ʈ�� �ǽ��ϱ� ���� p494
 */
public class IOTest {
	public static void main(String[] args) {
		
		// �ý��� �⺻ �Է½�Ʈ��
		Scanner scan = new Scanner(System.in);
		
		// �ý��� �⺻ ��½�Ʈ��
		System.out.print("�̸� �Է� : ");
		
		String name = scan.nextLine();
		System.out.println("�̸� : "+name);
	}
}
