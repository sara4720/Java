package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��¥ : 2020/11/24
 * �̸� : ����
 * ���� : ���� ����� ��Ʈ�� �ǽ��ϱ� ���� p496
 */
public class FileIOTest {

	public static void main(String[] args) {
		
		String filePath   = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		String targetPath = "C:\\Users\\bigdata\\Desktop\\sample2.txt";
		
		
		try {
			// ���ϰ� �Է½�Ʈ�� ����
			FileInputStream  fis = new FileInputStream(filePath);
			FileOutputStream fos = new FileOutputStream(targetPath);
			
			int value = 0;
			
			while(true) {
				// fis�� ������ �б�
				value = fis.read();
				
				if(value == -1) {
					// �� �̻� ���� �����Ͱ� ���� ���
					break;
				}
				
				//char ch = (char) value;
				//System.out.print(ch);
				
				// fos�� ������ ����
				fos.write(value);
			}
			
			// ��Ʈ�� ����
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����...");
	}
}
