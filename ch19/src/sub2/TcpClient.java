package sub2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/*
 * ��¥ : 2020/11/24
 * �̸� : ����
 * ���� : TCP ������� ���α׷��� ���� p529
 */
public class TcpClient {

	public static void main(String[] args) throws IOException {
		
		Socket socket = new Socket();
		
		System.out.println("���� ��û...");
		socket.connect(new InetSocketAddress("127.0.0.1", 5001));
		
		System.out.println("���� ����!!!");
		
		// ������ �����ϱ�
		OutputStream os = socket.getOutputStream();
		String message = "Hello Server!";
		
		byte[] msgBytes = message.getBytes();
		os.write(msgBytes);
		os.flush();
		
		System.out.println("������ ���� �Ϸ�...");
		
		
		if(!socket.isClosed()) {
			socket.close();
		}
		
		System.out.println("TcpClinet ����...");
	}
	
}



