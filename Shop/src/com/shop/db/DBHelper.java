package com.shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {

	// DB 정보
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String HOST = "jdbc:mysql://localhost:3306/shop";
	private static final String USER = "root";
	private static final String PASS = "1234";
	
	// 자원
	protected Connection conn;
	protected PreparedStatement psmt;
	protected Statement stmt;
	protected ResultSet rs;
	
	// 커넥션
	protected Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER);
		return DriverManager.getConnection(HOST, USER, PASS);
	}
	
	// 연결 해제
	protected void close() throws SQLException{
		if(rs != null) rs.close();
		if(psmt != null) psmt.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	}
}
