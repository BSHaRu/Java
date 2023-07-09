package net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class WebSever {
	public static void main(String[] args) throws Exception {
		// 클라이언트가 접속할 때까지 대기할 때 필요한 객체 
		// -> ServerSoket
		ServerSocket serverSocket = new ServerSocket(10000);
		
		try {
			// 여기서 반복을 해야 서버가 안죽고 계속 유지
			while(true) {
				System.out.println("1 - 연결 대기");
				// 대기
				// -> 클라이언트가 접속하면 
				// 클라이언트와 통신하는 Socket 반환
				Socket clientSocket = serverSocket.accept();
				
				System.out.println("2 - 연결 완료");
				
				// 멀티 스레드로 처리해야 여러명이 접속해도 대기가 덜걸림
				ClientThread ct = new ClientThread(clientSocket);
				ct.start();
			}
		}finally {
			// try 밖에 serverSocket 생성해놔서
			// try안에서 안닫혀서 finally로 닫아주는거임
			serverSocket.close();
		}
		
	} // main end
}

class ClientThread extends Thread{
	private Socket clientSocket;

	public ClientThread(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}
	
	public void run() {
		try {
			InputStream is = clientSocket.getInputStream();
			BufferedReader br 
				= new BufferedReader(
						new InputStreamReader(is));
			
			// 응답을 하기 위해서는 소켓에 대한 내용을 써줘야됨.
			OutputStream os = clientSocket.getOutputStream();
			// 한 줄 씩 써주는 writer
			PrintWriter pw 
				= new PrintWriter(
						new OutputStreamWriter(os));
			
			// http://localhost:10000/hello
			// -> GET /hello HTTP/1.1
			// => 첫 줄은 GET 정보
			String firstLine = br.readLine();
			String msg = "";
			// get으로 어디로 보내는가에 따라
			// msg 다르게 출력하는거 보여줌
			// indexOf로 문자열로도 찾을 수 있다.
			if(firstLine.indexOf("/hello") >= 0)
				msg = "hello";
			else if(firstLine.indexOf("/hi") >= 0)
				msg = "hi";
			
			System.out.println(firstLine);
			
			String line = null;
			// 빈줄이 아니면 line 출력
			// -> 헤더들 출력(빈줄이 아닐 때까지)
			while(!(line=br.readLine()).equals("")) {
				// 빈줄까지 읽으면 while 끝
				System.out.println(line);
			}
			
			System.out.println("3 - 응답");
			
			// 응답
			pw.println("HTTP/1.1 200 OK"); 
			// 헤더
			pw.println("name : kim");
			pw.println("email : haru@haru.com");
			pw.println(""); // 빈줄
			// 여기 flush를 해줘야 body에서 미리
			// 헤더의 content-length와 type을 읽고
			// 그 정보를 body에서 출력해줄 수 있다.
			pw.flush();
			
			// body 내용
			//-> GET /hello HTTP/1.1의 요청이 온다면
			// hello에 대한 파일을 읽어서 출력을 해줘야함
			// but, png같은 binary파일일 경우에는
			// 헤더의 length와 type을 보고 출력을 해줘야함
			// -> print로 출력이 아니라 os를 통해서
			// 그 byte 크기 만큼 보내줘야 출력을 해줘야함
			pw.println("<html>");
			pw.println("<h2>" +msg+ " world</h2>");
			pw.println("</html>");
			// 이 flush를 안해주면 body 내용을 못읽는다.
			pw.flush();
			
			br.close();
			pw.close();
			clientSocket.close();
		}catch(Exception e) {
			e.getMessage();
		}
	} // run end
}