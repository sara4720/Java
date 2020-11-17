package sub3;
/*
 * ��¥ : 2020/11/17
 * �̸� : ����
 * ���� : String ����޼��� �ǽ��ϱ� ���� p302
 */
public class StringMemberTest {

	public static void main(String[] args) {
		
		String str = "Hello Korea";
		
		
		// length - ���ڿ��� ����
		System.out.println("���ڿ� str ���� : "+str.length());
		
		
		// charAt - ���ڿ����� Ư������ ����
		System.out.println("���ڿ� str�� 6�� index ���� : "+str.charAt(6));
		
		
		// subStirng - ���ڿ� �ڸ���
		System.out.println("���ڿ� str���� 0���� 5���� ���ڿ� : "+str.substring(0,5));
		System.out.println("���ڿ� str���� 6���� ���������� ���ڿ� : "+str.substring(6));
		
		
		// indexOf, lastIndexOf - ���ڿ����� Ư�� �������ؽ� ��ȣ ����
		int idx1 = str.indexOf("e");
		int idx2 = str.lastIndexOf("e");
		
		System.out.println("���ڿ� str���� �տ��� ���� ���� e�� �ε��� ��ȣ : "+idx1);
		System.out.println("���ڿ� str���� �ڿ��� ���� ���� e�� �ε��� ��ȣ : "+idx2);
		
		
		// replace - ���ڿ� ��ü
		String newStr = str.replace("Korea", "USA");
		System.out.println("newStr : "+newStr);

		
		// valueOf - �⺻Ÿ�� ������ ���ڿ��� ��ȯ
		int var1 = 1;
		double var2 = 2.13;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		
		
	}
}
