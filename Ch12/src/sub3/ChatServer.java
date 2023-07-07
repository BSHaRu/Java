package sub3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 날짜 : 2023.07.06
 * 내용 : 채팅 프로그램 실습
 */

public class ChatServer {

	public static void main(String[] args) {
		System.out.println("[Sever Start]");
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9001);
			System.out.println("연결 대기..");
			// 연결이 되어야 socket이 만들어지는거임
			socket = serverSocket.accept();
			
			System.out.println("Client와 연결 완료");
			
			Thread t1 = new ThreadSender(socket);
			Thread t2 = new ThreadReceiver(socket);
			
			t1.start();
			t2.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
