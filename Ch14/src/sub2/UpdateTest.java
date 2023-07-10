package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 날짜 : 2023.07.10
 * 내용 : JDBC Update 실습
 */


public class UpdateTest {

	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC driver 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - DB 연결
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL 실행
			String sql = "Update `user1` SET "
					+ " hp = '010-1111-2222', "
					+ " age = 11 "
					+ " WHERE uid = 'j101'";
			
			stmt.executeUpdate(sql);
			System.out.println("업데이트 완료");
			
			// 5단계 - 결과 처리(Select 아니라서 생략)
			
			// 6단계 - 연결 해제
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Driver 정보 없음 : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 접속 불가 : " +e.getMessage());
		}
		System.out.println("프로그램 종료");
	}
}
