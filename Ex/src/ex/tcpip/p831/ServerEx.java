package ex.tcpip.p831;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
	
	private static ServerSocket serverSocket = null;
	
	public static void main(String[] args) {
		System.out.println("============================");
		System.out.println("서버를 종료하려면 q또는 Q를 입력하세요");
		System.out.println("============================");
		
		// TXP 서버 시작
		startServer();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			String key = sc.nextLine();
			if(key.toLowerCase().equals("q")) break;
		}
		sc.close();
		
		// TCP 서버 종료
		stopSever();
	} // main end

	private static void startServer() {
		// 작업 스레드 정의
		Thread thread = new Thread() {
			public void run() {
				
				// ServerSocket 생성 및 Port 바인딩
				try {
					serverSocket = new ServerSocket(8080);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						System.out.println("\n[서버] 연결 요청을 기다림..\n");
						// 연결 대기
						Socket socket = serverSocket.accept();
						
						// 연결된 클라이언트 정보 얻기
						// InetSocketAddress 
						// -> 특정 ip에서만 서비스 하고 싶으면 첫번째 매개값으로 해당 ip주면 됨
						// getRemoteSocketAddress()
						// -> 연결된 클라이언트의 ip와 port번호 알 수 있음
						InetSocketAddress isa 
							= (InetSocketAddress) socket.getRemoteSocketAddress();
						System.out.println("[서버] " + isa.getHostName() + "의 연결 요청 수락함");
						
						// 연결 끊기
						socket.close();
						System.out.println("[서버] " + isa.getHostName() + "의 연결을 끊음");
					}
				} catch (IOException e) {
					System.out.println("[서버] : " + e.getMessage());
				}// try catch end
			} // run end
		};
		// 스레드 시작
		thread.start();
	} // startServer end
	
	private static void stopSever() {
		try {
			// ServerSocket을 닫고 Port 언바인딩
			serverSocket.close();
			System.out.println("[서버] 종료됨");
		} catch (IOException e) {
			System.out.println("소켓 안닫힘 : " + e.getMessage());
		}
	} // stopSever end
}
