package test3;
/*
 * ��¥ : 2020/11/26
 * �̸� : ����
 * ���� : String Ŭ���� ��������
 */
public class JavaTest3 {

	public static void main(String[] args) {
		String fileName = "�ڹ� ������.hwp";
		
		int idx = fileName.indexOf(".");
		
		String title = fileName.substring(0,idx);
		String ext  = fileName.substring(idx+1);
		
		System.out.println("���ϸ� : "+title);
		System.out.println("Ȯ���� : "+ext);
				
	}
}
