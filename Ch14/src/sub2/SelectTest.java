package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 날짜 : 2023.07.10
 * 내용 : JDBC Select 실습
 */

public class SelectTest {

	public static void main(String[] args) {

		// DB 정보
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - driver 연결
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - DB 연결
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - sql 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 - sql 실행
			String sql = "Select * From user1"; 
			ResultSet rs = stmt.executeQuery(sql);
			
			// 5단계 - 결과 처리(Select문이라서 해야됨)
			while(rs.next()) {
				String uid 	= rs.getString(1);
				String name = rs.getString(2);
				String hp	= rs.getString(3);
				int age 	= rs.getInt(4);
				
				System.out.printf("%s, %s, %s, %d\n",uid, name, hp, age);
			}
			System.out.println("검색 완료");
			
			// 6단계 - 연결 해제
			rs.close();
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
