package sub1;
/*
 * ��¥: 2020/11/04
 * �̸�: ����
 * ����: �迭 �ǽ��ϱ� ���� p108
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		
		
		
		// ����(Variable)
		int num1 = 1; 
		int num2 = 2; 
		int num3 = 3; 
		int num4 = 4; 
		int num5 = 5;
		
		
		
		// �迭(Array)   [] <== ��Ŵ� ������ �� �� ����. int ��, nums ��/�� ����
		
		int[] nums =  {1,2,3,4,5};
		
		// �迭�� ���� = ������ ���� 
		
		System.out.println("�迭 nums�� ���� : "+nums.length);
		
		// �迭�� ���� ��� , ���Ҵ� ��ȣ�� ����(index)_0���� ����
		
		System.out.println("�迭 nums�� ù��° ����: "+nums[0]);
		System.out.println("�迭 nums�� �ι�° ����: "+nums[1]);
		System.out.println("�迭 nums�� ����° ����: "+nums[2]);
		System.out.println("�迭 nums�� �׹�° ����: "+nums[3]);
		System.out.println("�迭 nums�� �ټ���° ����: "+nums[4]);
		
		for(int i=0; i<nums.length; i++) {
			System.out.println("�迭 nums["+i+"]: "+nums[i]);
		}
		
		// �迭�� �ݺ���
		
		for(int num : nums) {
			System.out.println("�迭 nums�� ���� : "+num);
		}
		
		// Ȯ�ι���
		String person1 = "������";
		String person2 = "������";
		String person3 = "�庸��";
		String person4 = "������";
		String person5 = "�̼���";
		
		String[] people = {"������", "������","�庸��", "������", "�̼���"};

		for(String person: people) {
		System.out.println("�迭 people ���� : "+person);
		}
		
		
		
	}

}
