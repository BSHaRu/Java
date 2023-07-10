package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 날짜 : 2023.07.10
 * 내용 : JDBC Insert 실습
 */

public class InsertTest {

	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 : JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 : DB 접속
			Connection conn = DriverManager.getConnection(host, user, pass);

			// 3단계 : SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 : SQL 실행
			String sql = "INSERT INTO `User1` "
					+ " VALUES('j101', '김유신', '010-1234-5678', 23)";
			stmt.executeUpdate(sql);
			// 5단계 : (Select문일 경우만) 결과 처리
			
			// 6단계 : 연결 해제
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver 정보 없음 : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 접속 불가 : " +e.getMessage());
		}
		System.out.println("Insert 완료");
	}

}
