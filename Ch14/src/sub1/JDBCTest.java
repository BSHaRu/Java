package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 날짜 : 2023.07.10
 * 내용 : JDBC 프로그래밍 실습
 * 
 * JDBC(Java DataBase Connectivity)
 *  - Java에서 DB 연결을 위한 기술 표준
 *  - Java는 기본적으로 java.sql 패키지를 포함하여
 *  	별도의 DBMS에 맞는 드라이버 설정하면됨(*.jar 파일)
 */

public class JDBCTest {

	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			// JDBC driver 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// DB 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			if(conn != null) 
				System.out.println("DB 연결 완료");
			else
				System.out.println("DB 연결 실패");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver 정보 없음 : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 접속 불가 : " +e.getMessage());
		}
		
	} // main
}
