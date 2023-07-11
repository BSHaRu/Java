package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * 날씨 : 2023.07.11
 * 내용 : PreparedStatement 실습
 */

public class PreparedInsetTest {

	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - driver 연결
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - db 연결
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - sql 실행 객체 생성
			String sql = "INSERT INTO user1 VALUES (?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "j101");
			psmt.setString(2, "김유신");
			psmt.setString(3, "010-1234-1111");
			psmt.setInt(4, 25);
			
			// 4단계 - sql 실행
			psmt.executeUpdate();
			System.out.println("insert 완료");
			
			// 5단계 - 결과 처리(Select 아니니깐 생략)
			
			// 6단계 - 연결해제
			psmt.close();
			conn.close();
		}catch (ClassNotFoundException e) {
			System.out.println("Driver 정보 없음 : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 접속 불가 : " +e.getMessage());
		}
		System.out.println("프로그램 종료");
		
	}
}
