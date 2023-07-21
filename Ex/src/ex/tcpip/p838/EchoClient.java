package ex.tcpip.p838;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClient {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("localhost",8080);
			System.out.println("[클라이언트] 연결 성공");
			
			//----------------------------------------------------
			
			Scanner sc = new Scanner(System.in);
			// 데이터 보내기
//			String sendMessage = sc.nextLine();
//			OutputStream os = socket.getOutputStream();
//			byte[] bytes = sendMessage.getBytes("UTF-8");
//			os.write(bytes);
//			os.flush();
//			System.out.println("[클라이언트] 데이터 보냄 : " + sendMessage);
//			
//			// 데이터 받기
//			InputStream is = socket.getInputStream();
//			bytes = new byte[1024];
//			int readByteCount = is.read(bytes);
//			String receiveMessage 
//				= new String(bytes, 0, readByteCount, "UTF-8");
//			System.out.println("[클라이언트] 데이터 받음 : " + receiveMessage);
//			
			//----------------------------------------------------
			
			// 데이터 보내기 ver2
			String sendMsg = sc.nextLine();
			DataOutputStream dos 
				= new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMsg);
			dos.flush();
			System.out.println("[클라이언트] 데이터 보냄 : " + sendMsg);
			
			// 데이터 받기
			DataInputStream dis 
				= new DataInputStream(socket.getInputStream());
			String receiveMsg = dis.readUTF();
			System.out.println("[클라이언트] 데이터 받음 : " + receiveMsg);
			
			//----------------------------------------------------

			sc.close();
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
