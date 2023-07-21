package ex.tcpip.p838;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoSever {

	private static ServerSocket serverSocket = null;
	
	public static void main(String[] args	) {
		System.out.println("============================");
		System.out.println("서버를 종료하려면 q또는 Q를 입력하세요");
		System.out.println("============================");
		
		// TXP 서버 시작
		startServer();
		
		// 키보드 입력
		Scanner sc = new Scanner(System.in);
		while(true) {
			String key = sc.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		sc.close();
		
		// TCP 서버 종료
		stopServer();

	} // main end

	private static void startServer() {
		
		// 스레드 정의
		Thread thread = new Thread() {
			@Override
			public void run() {
				
				try {
					// ServerSocket 생성 및 port 바인딩
					serverSocket = new ServerSocket(8080);
					System.out.println("[서버] 시작");
					
					//연결 수락 및 데이터 통신
					while(true) {
						System.out.println("\n[서버] 연결 요청 기다림\n");
						//연결 수락
						Socket socket = serverSocket.accept();
						
						// 연결된 클라이언트 정보 얻기
						InetSocketAddress isa 
							= (InetSocketAddress) socket.getRemoteSocketAddress();
						System.out.println("[서버] " + isa.getHostName()+"님의 연결 요청을 수락함");
						
						//----------------------------------------------------
						
						// 데이터 받기
//						InputStream is = socket.getInputStream();
//						byte[] bytes = new byte[1024];
//						int readByteCount = is.read(bytes);
//						String message 
//							//byte 배열 | 시작 할 위치(바이트 배열내의 인덱스) | 읽은 바이트 수 | 인코딩
//							= new String(bytes, 0, readByteCount, "UTF-8");
//						
//						// 데이터 보내기
//						OutputStream os = socket.getOutputStream();
//						bytes = message.getBytes("UTF-8");
//						os.write(bytes);
//						os.flush();
//						System.out.println("[서버] 받은 데이터를 다시 보냄 : " + message);
						
						//----------------------------------------------------
						
						// 데이터 받기 ver2
						// DataInputStream은 BufferedInputStream을 상속 받고 있음
						// -> 별도의 버퍼를 사용 안해도 알아서 버퍼 처리가 되고 있음
						DataInputStream dis 
							= new DataInputStream(socket.getInputStream());
						String msg = dis.readUTF();
						
						// 데이터 보내기 ver2
						DataOutputStream dos 
							= new DataOutputStream(socket.getOutputStream());
						dos.writeUTF(msg);
						dos.flush();
						System.out.println("[서버] 받은 데이터를 다시 보냄 : " + msg);
						
						//----------------------------------------------------
						
						// 연결 끊기
						socket.close();
						System.out.println("[서버] " + isa.getHostName() + "의 연결을 끊음");
					}// while end
					
				} catch (IOException e) {
					System.out.println("[서버] : " + e.getMessage());
				}
				
			}// run end
		}; // tread end
		
		// 스레드 시작
		thread.start();
	} // start end

	private static void stopServer() {
		try {
			//ServerSocket 닫고 Port 언바인딩
			serverSocket.close();
			System.out.println("[서버] 종료됨");
		} catch (IOException e) {
			System.out.println("[서버] 왜 안꺼짐? " + e.getMessage());
		}
	} // stop end
	
} // EchoServer end


