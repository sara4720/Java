package sub2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/*
 * 날짜 : 2020/11/24
 * 이름 : 김사라
 * 내용 : TCP 소켓통신 프로그래밍 교재 p529
 */
public class TcpClient {

	public static void main(String[] args) throws IOException {
		
		Socket socket = new Socket();
		
		System.out.println("연결 요청...");
		socket.connect(new InetSocketAddress("127.0.0.1", 5001));
		
		System.out.println("연결 성공!!!");
		
		// 데이터 전송하기
		OutputStream os = socket.getOutputStream();
		String message = "Hello Server!";
		
		byte[] msgBytes = message.getBytes();
		os.write(msgBytes);
		os.flush();
		
		System.out.println("데이터 전송 완료...");
		
		
		if(!socket.isClosed()) {
			socket.close();
		}
		
		System.out.println("TcpClinet 종료...");
	}
	
}



