package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/*
 * ��¥ : 2020/11/24
 * �̸� : ����
 * ���� : ��Ʈ���� Property ���� ���� �ǽ��ϱ�
 */
public class PropertyTest {
	
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		prop.setProperty("101", "����");
		prop.setProperty("102", "����");
		prop.setProperty("103", "�뱸");
		prop.setProperty("104", "�λ�");
		prop.setProperty("105", "����");
		
		
		System.out.println("101�� ������ : "+prop.getProperty("101"));
		System.out.println("102�� ������ : "+prop.getProperty("102"));
		System.out.println("104�� ������ : "+prop.getProperty("104"));
		
		// ��Ʈ���� ���� ������ ���� ��������
		String filePath = "C:\\Users\\bigdata\\Desktop\\cities.properties";
		
		FileInputStream fis = new FileInputStream(filePath);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		
		Properties country = new Properties();
		country.load(isr);
		
		System.out.println("101�� ���� : "+country.getProperty("101"));
		System.out.println("102�� ���� : "+country.getProperty("102"));
		System.out.println("105�� ���� : "+country.getProperty("105"));
		
		
	}
}
