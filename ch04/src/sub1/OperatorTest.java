package sub1;

/*
 * ��¥: 2020/11/03
 * �̸�: ��ö��
 * ����: ������ �ǽ��ϱ� ���� p52
 */
public class OperatorTest {
	
	public static void main(String[] args) {
		//���������
		int num1 = 1, num2 = 2, num3= 3, num4 = 4;
		
		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num1 * num2;
		int rs4 = num1 / num2;
		int rs5 = num1 % num2;
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
		System.out.println("rs4 : "+rs4);
		System.out.println("rs5 : "+rs5);
		
		//����, ���� ������
		int n1 = 1, n2 = 2;
		
		n1++; // 1 ���� ��Ű��
		++n1;
		
		n2--;
		--n2;
		
		System.out.println("n1 : " +n1);
		System.out.println("n2 : " +n2);
		
		//���մ��� ������
		int no1 = 1;   //�� �ܾ ������ �ι�° �ܾ�� �빮�ڷ� ǥ���Ѵ�
		int no2 = 2;
		int no3 = 3;
		int no4 = 4;
		
		no1 += 1; //no1 = no1 + 1
		no2 -= 1; //no2 = no2 - 1
		no3 *= 1; //no3 = no3 * 1
		no4 /= 1; //no4 = no4 / 1
		
		System.out.println("no1 : "+no1);
		System.out.println("no2 : "+no2);
		System.out.println("no3 : "+no3);
		System.out.println("no4 : "+no4);
		
		
		//�� ������
		int var1 = 1;
		int var2 = 2;
		
		
		boolean res1 = (var1 > var2); //true false ������ �ϴ� �� boolean 
		boolean res2 = (var1 < var2); //true false ������ �ϴ� �� boolean 
		boolean res3 = (var1 >= var2); //true false ������ �ϴ� �� boolean 
		boolean res4 = (var1 <= var2); //true false ������ �ϴ� �� boolean 
		boolean res5 = (var1 == var2); //true false ������ �ϴ� �� boolean 
		boolean res6 = (var1 != var2); //true false ������ �ϴ� �� boolean 
		
		System.out.println("res1 : " +res1);
		System.out.println("res2 : " +res2);
		System.out.println("res3 : " +res3);
		System.out.println("res4 : " +res4);
		System.out.println("res5 : " +res5);
		System.out.println("res6 : " +res6);

		//�� ������
		boolean result1 = (var1 > 1) && (var2 < 3); // var1�� 1���� ũ�� var2�� 3���� �۴�. False
		boolean result2 = (var1 > 0) && (var2 < 3); // var1�� 0���� ũ�� var2�� 3���� �۴�. True
		boolean result3 = (var1 > 1) || (var2 < 3); // var1�� 1���� ũ�ų� var2�� 3���� �۴�. True
		boolean result4 = (var1 > 1) || (var2 < 2); // var1�� 1���� ũ�ų� var2�� 2���� �۴�. False
		boolean result5 = !(var1 > var2); // var1�� var2���� ũ���ʴ�. True
		
		System.out.println("result1: " +result1);
		System.out.println("result2: " +result2);
		System.out.println("result3: " +result3);
		System.out.println("result4: " +result4);
		System.out.println("result5: " +result5);

		
			
	
	}

}
