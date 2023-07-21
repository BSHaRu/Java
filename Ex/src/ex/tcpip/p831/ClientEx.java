package ex.tcpip.p831;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("localhost",8080);
			
			System.out.println("[클라이언트] 연결 성공");
			
			// 소켓 닫기
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		} catch (UnknownHostException e) {
			System.out.println("IP 표기 방법이 잘못 되었습니다." + e.getMessage());
		} catch (IOException e) {
			System.out.println("해당 포트의 서버에 연결 할 수 없습니다. " + e.getMessage());
		}
	}

}
