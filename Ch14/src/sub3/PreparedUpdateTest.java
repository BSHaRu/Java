package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * 날씨 : 2023.07.11
 * 내용 : PreparedStatement 실습
 */

public class PreparedUpdateTest {

	public static void main(String[] args) {
		
		// db 정보
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			// driver 연결
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// db연결
			Connection conn = DriverManager.getConnection(host, user, pass); 
			
			// sql 실행 객체 생성
			String sql = "UPDATE user1 SET "
					+ " hp = ?, "
					+ " age = ? "
					+ " WHERE uid = ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "010-1234-2222");
			psmt.setInt(2, 23);
			psmt.setString(3, "j101");
			
			// sql 실행
			psmt.executeUpdate();
			System.out.println("update 완료");
			
			// 연결해제
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
