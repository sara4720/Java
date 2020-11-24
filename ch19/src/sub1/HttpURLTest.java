package sub1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * ��¥ : 2020/11/24
 * �̸� : ����
 * ���� : HTTP ��� �ǽ��ϱ� ���� p521
 */
public class HttpURLTest {

	public static void main(String[] args) throws IOException {
		
		URL ur1 = new URL("https://www.google.com/");
		
		InputStreamReader isr = new InputStreamReader(ur1.openStream());
		BufferedReader br = new BufferedReader(isr);
		
		String line = null;
		
		while(true) {
			
			line = br.readLine();
			
			if(line == null) {
				break;
			}
			
			System.out.println(line);
		
		}
		
		br.close();
		
		System.out.println("���α׷� ���� ... ");
	}
}
