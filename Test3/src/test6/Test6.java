package test6;
/*
��¥ : 2020/11/23
�̸� : ����
���� : Ŭ���� ��� ��������
*/
class Rent {
public void payment() {
	System.out.println("�Ӵ�Ḧ �޽��ϴ�.");
}
}

class Landload extends Rent {
	
public void getMoney() {
	System.out.println("�ǹ��� �Դϴ�.");
	payment();
}
}

public class Test6 {
public static void main(String[] args) {

	Landload master = new Landload();
	master.getMoney();
	
}	
}
