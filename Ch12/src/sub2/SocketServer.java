package sub2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *  날짜 : 2023.07.06
 *  내용 : 소켓 프로그래밍 실습
 */

public class SocketServer {
	public static void main(String[] args) {
		System.out.println("[Server start]");
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(
					new InetSocketAddress("127.0.0.1", 5001));
			
			System.out.println("연결 대기..");
			Socket socket = serverSocket.accept();
			
			System.out.println("Client와 연결 완료");
			// 데이터 통신 (Server -> Client)
			// 위에서 socket에 Client가 연결 되었기 때문에
			// 여기서 socket은 Client의 socket이다??
			OutputStream os = socket.getOutputStream();
			String msg = "Hello Client";
			
			byte[] msgBytes = msg.getBytes();
			os.write(msgBytes);
			os.flush();
			
			System.out.println("Clinet가 데이터 전송 완료");
			
			// 데이터 수신 (Client -> Sever)
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte[100];
			int readBytes = is.read(bytes);
			
			String result = new String(
					bytes, 0, readBytes, "UTF-8");
			System.out.println(result);
			System.out.println("데이터 수신 완료");
			
			os.close();
			is.close();
			socket.close();
		} catch (IOException e) {
			System.out.println("socket 문제 : " + e.getMessage());
		}
		
		// 위에 try문 안에 소켓을 닫아줬지만,
		// 혹시라도 안닫아 졌으면 여기서 닫아주겠따.
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				System.out.println("socet 안 닫힘 : " + e.getMessage());
			}
		}
		
		System.out.println("[Server end..]");
	} // main end
}
