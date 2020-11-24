package sub3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/*
 * ��¥ : 2020/11/24
 * �̸� : ����
 * ���� : ���� ����� ��Ʈ�� �ǽ��ϱ� ���� p501
 */
public class ReaderTest {
	
	public static void main(String[] args) {
		
		String filePath   = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		String targetPath = "C:\\Users\\bigdata\\Desktop\\sample2.txt";
		
		try {
			// ���ϰ� �Է½�Ʈ�� ����
			FileInputStream fis = new FileInputStream(filePath);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			
			int value = 0;
			
			while(true) {
				// fis�� ������ �б�
				value = isr.read();
				
				if(value == -1) {
					// �� �̻� ���� �����Ͱ� ���� ���
					break;
				}
				
				char ch = (char) value;
				System.out.print(ch);
			}
			
			// ��Ʈ�� ����
			isr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����...");		
		
	}

}
