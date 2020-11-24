package sub2;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));
			
			while(true) {
				
				System.out.println("연결 대기...");
				
				Socket socket = serverSocket.accept();
				
				System.out.println("연결 수립!!!");
				
				// 데이터 수신하기
				InputStream is = socket.getInputStream();
				byte[] bytes = new byte[100];
				int readByteds = is.read(bytes);
				
				String result = new String(bytes, 0, readByteds, "UTF-8");
				System.out.println("데이터 수신완료 : "+result);
				
				socket.close();
				
			}// while end
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("TcpServer 종료...");
	}

}