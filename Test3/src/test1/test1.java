package test1;
/*
 * ��¥: 2020/11/19
 * �̸� : ����
 * ���� : �ڹ� Ŭ���� ��������
 */
public class test1 {

	private String name;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
	    test1 obj = new test1();
		obj.setName("ȫ�浿");
		
		System.out.println(obj.getName());
	}
}
