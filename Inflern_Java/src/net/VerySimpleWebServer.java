package net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class VerySimpleWebServer {
	public static void main(String[] args) throws Exception {
		// 9090 port로 대기한다.
		ServerSocket ss = new ServerSocket(9090);
		
		// 클라이언트를 대기
		// 클라이언트가 접속하는 순간, 
		// 클라이언트와 통신 할 수 있는 socket 반환
		// 브라우저에 127.0.0.1:9090 입력
		// -> server에서 GET / HTTP/1.1 메세지를 보냄
		// => GET 방식으로 들어왔고, 아무런 내용이없다 /
		// -> 127.0.0.1:9090/Hello.html
		// => GET /Hello.html / HTTP / 1.1
		System.out.println("클라이언트 접속 대기");
		// Socket은 브라우저(client)와 통신 할 수 있는 객체
		Socket socket = ss.accept();
		
		// Client(socket 객체)와 읽고 쓸 수 있는 os,is가 나옴
		OutputStream os = socket.getOutputStream();
		// 한줄 한줄 출력하고 쓰기 위해서 pw와 br을 추가해준거임
		PrintWriter pw 
			= new PrintWriter(new OutputStreamWriter(os));
		
		InputStream is = socket.getInputStream();
		BufferedReader br 
			= new BufferedReader(new InputStreamReader(is));
		
		// HTTP프로토콜은 Client가 정보를 서버에게 보내줌(요청정보)
		// ->Client가 보내는 정보를 먼저 읽는 작업부터 해야됨
		
		// header 정보를 한줄씩 읽겠다.
		// 브라우저에서 먼저 요청정보를 보냄
		// -> 그걸 첫번째 줄 까지 읽어라
		String firstLine = br.readLine();
		List<String> headers = new ArrayList<>();
		String line = null;
		// 빈줄이 아닐 때 까지 읽어라 
		// -> 빈줄을 만나면 while문 종료
		while(!(line = br.readLine()).equals("")){
			headers.add(line);
		}
		// 요청정보 읽기 끝
		
		System.out.println(firstLine);
		for(int i = 0; i<headers.size(); i++) {
			// 읽어 들인걸 header 정보를 화면에다가 출력
			System.out.println(headers.get(i));
		}
		
//		System.out.println(socket.toString());
		
		// 서버에게 응답 메세지 보내기.
		// HTTP/ 1.1 200 OK <-- 상태메세지
		// header 1
		// header 2
		// 빈줄
		// 내용
		pw.println("HTTP/1.1 200 OK");
		pw.println("name : hong");
		pw.println("email : a@a.a");
		pw.println();
		pw.println("<html>");
		pw.println("<h1>Hello!</h1>");
		pw.println("</html>");
		pw.close();
		
		
		
		ss.close();
		System.out.println("서버가 종료 됩니다.");
		// 이렇게 한번 요청 보내고 바로 죽는 웹 서버 만듬
		// => 서버 안죽고 계속 유지 하기 위해서 Thread가 필요
	}
}
