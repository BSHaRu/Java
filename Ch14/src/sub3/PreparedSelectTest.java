package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * 날씨 : 2023.07.11
 * 내용 : PreparedStatement 실습
 * 
 * PreparedStatement
 *  - 기존 Statement보다 향상된 동적 SQL 생성을 위한 친구
 *  - Query Parameter(?를 의미)에 값을 Mapping 시켜 query문 실행
 *  
 * VO(Value Object)객체
 *  - 도메인 값(테이블 칼럼명)의 속성을 갖는 객체
 *  - 테이블 Entity(개체)를 Object(객체)로 변환 할 때 사용하는 객체
 *  
 */
// VO(Value Object) : 테이블 Entity(개체)가 변환되는 객체
// -> DB 데이터 받아 오는 객체
class User1VO{
	private String uid;
	private String name;
	private String hp;
	private int age;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}


public class PreparedSelectTest {

	public static void main(String[] args) {
		
		// db 정보
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		// 결과처리에 사용할 List 생성
		List<User1VO> users = new ArrayList<>();
		
		try {
			// driver 연결
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// db 연결
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// sql 실행 객체 생성
			String sql = "SELECT * FROM user1";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// sql 실행
			ResultSet rs = psmt.executeQuery();
			
			// 결과처리
			while(rs.next()) {
				/*
				String uid 	= rs.getString(1);
				String name = rs.getString(2);
				String hp 	= rs.getString(3);
				int age 	= rs.getInt(4);
				*/
				User1VO vo = new User1VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				// VO 객체 List 저장
				users.add(vo);
			}
			System.out.println("검색 결과 값 저장");
			
			// 연결 해제
			rs.close();
			psmt.close();
			conn.close();
		}catch (ClassNotFoundException e) {
			System.out.println("Driver 정보 없음 : " + e.getMessage());
		}catch (SQLException e) {
			System.out.println("DB 접속 불가 : " +e.getMessage());
		}
		// List 결과물 출력
		for(User1VO vo : users) {
			System.out.println("아이디 : " + vo.getUid());
			System.out.println("이름 : " + vo.getName());
			System.out.println("전화번호 : " + vo.getHp());
			System.out.println("나이 : " + vo.getAge());
			System.out.println("=============================");
		}
		
		System.out.println("프로그램 종료");
	}

}
