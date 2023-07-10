package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 날짜 : 2023.07.10
 * 내용 : JDBC Delete 실습
 */

public class DeleteTest {

	public static void main(String[] args) {

		// DB 정보
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - Driver 연결
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - DB 연결
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - sql 생성 객채 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 - sql 생성
			String str = "Delete from user1 "
					+ " WHERE uid = 'j101'";
			stmt.executeUpdate(str);
			System.out.println("삭제 완료");
			
			// 5단계 - 결과 처리(select 문 아니라 생략)
			
			// 6단계 - 연결 해제
			stmt.close();
			conn.close();
		}catch (ClassNotFoundException e) {
			System.out.println("Driver 정보 없음 : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 접속 불가 : " +e.getMessage());
		}
		System.out.println("프로그램 종료");
	}

}
