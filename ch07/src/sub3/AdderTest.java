package sub3;
/*
 * ��¥: 2020/11/09
 * �̸� : ����
 * ���� : ��ü�� �޸� ����� ������� 
 */
public class AdderTest {

	public static void main(String[] args) {
		
		int [] arr = {10,20,30};                                        //  heap�� adder  new ��ü ����
		 
		Adder a = new Adder(100);                                       // x �ϳ� �ִµ� 100���� �ʱ�ȭ �� (������ ȣ��)  --> stack �� a ���� 
		
		
		 
		a.add(100);                                                      
		System.out.println("��ü a�� ������� x : " +a.getX());              
		
		a.add(a);                                                        
		System.out.println("��ü a�� ������� x: " + a.getX());              
		
		a.add(arr);                                                     
		System.out.println("�迭 arr�� 1��° ���� : " + arr[0]);            
		
		a = a.addNew(a);                                                
		System.out.println("��ü a�� ������� x : "+a.getX());    
		
		 
		
	}
}
