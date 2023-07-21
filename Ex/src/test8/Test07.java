package test8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class User{
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
	@Override
	public String toString() {
		return uid + ", " + name + ", " + hp + ", " + age;
	}
}

public class Test07 {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String HOST = "jdbc:mysql://localhost:3306/userdb";
	private static final String USER = "root";
	private static final String PASS = "1234";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(HOST, USER, PASS);
	}

	public static void main(String[] args) {
		query("INSERT INTO User1 VALUES "
				+ "('j104', '홍길동', '010-4444-1111', 44)");
		System.out.println("데이터 입력 완료");
		
		List<User> result1 = query("select * from User1");
		List<User> result2 = query("SELECT * FROM User1 WHERE uid = 'j101'");
		
		System.out.println("===================");
		System.out.println("result1 결과");
		for(User user : result1) {
			System.out.println(user);
		}
		
		System.out.println("===================");
		System.out.println("result2 결과");
		for(User user : result2) {
			System.out.println(user);
		}
		
	} // main end

	
	
	private static List<User> query(String sql) {
		List<User> list = new ArrayList<>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(DRIVER);
			conn = getConnection();
			stmt = conn.createStatement();
			
			if(sql.toLowerCase().startsWith("select")) {
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					User user = new User();
					user.setUid(rs.getString(1));
					user.setName(rs.getString(2));
					user.setHp(rs.getString(3));
					user.setAge(rs.getInt(4));
					list.add(user);
				}
			}else {
				stmt.executeUpdate(sql);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
}
