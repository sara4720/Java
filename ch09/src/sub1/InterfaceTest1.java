package sub1;
/*
 * ��¥ : 2020/11/12
 * �̸� : ����
 * ���� : �������̽� �ǽ��ϱ� ���� p228
 */
public class InterfaceTest1 {

	public static void main(String[] args) {
		
		
		// �������̽� - Ŭ���� ������ ǥ�� ���̵带 ����
		RemoteControl lg = new RemoteLG();
		lg.PowerOn();
		lg.PowerOff();
		lg.chUp();
		lg.chDown();
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.PowerOn();
		samsung.PowerOff();
		samsung.chUp();
		samsung.chDown();
	}
}
