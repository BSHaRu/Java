package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * 날짜 : 2023.07.11
 * 내용 : 트랜잭션 실습
 * 
 * 트랜잭션(Transaction) 
 *  - 트랜잭션은 DB 처리의 최소 작업단위로 하나의 작업은 소작업으로 구성
 *  - 트랜잭션은 모두 성공 or 모두 실패 해야함
 *  - commit은 모든 작업의 성공 처리, rollback은 모든 작업의 실패 처리
 */

public class TransactionTset {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("에러를 발생 하시겠습니까?");
		int answer = sc.nextInt();
		
		// DB 정보
		String host = "jdbc:mysql://localhost:3306/bank";
		String user = "root";
		String name = "1234";
		
		Connection conn = null;
		
		try {
			// driver 연결
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// db 연결
			conn = DriverManager.getConnection(host, user, name);
			
			// 트랜잭션 시작
			conn.setAutoCommit(false);
			
			// sql 실행 객체 생성
			String sql1 = "UPDATE bank_account SET "
					+ " a_balance = a_balance - 10000 "
					+ " WHERE a_no = ?";
			String sql2 = "UPDATE bank_account SET "
					+ " a_balance = a_balance + 10000 "
					+ " WHERE a_no = ?";
			
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			psmt1.setString(1, "101-11-1001");
			
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt2.setString(1, "101-11-1003");
			
			// sql 실행
			psmt1.executeUpdate();
			
			if(answer == 1) throw new Exception("에러가 발생함");
			
			psmt2.executeUpdate();
			
			// 트랜잭션 확정 - 성공 처리
			conn.commit();
			System.out.println("트랜잭션 완료");
			
			// 연결 해제
			psmt1.close();
			psmt2.close();
			conn.close();
		}catch (ClassNotFoundException e) {
			System.out.println("Driver 정보 없음 : " + e.getMessage());
		}catch (SQLException e) {
			System.out.println("DB 접속 불가 : " +e.getMessage());
		}catch (Exception e) {
			System.err.println(e.getMessage());
			try {
				// 트랜잭션 취소 - 실패 처리
				conn.rollback();
			} catch (SQLException e1) {
				System.out.println("rollback 실패 : " + e1.getMessage());
			}
		}
		
		sc.close();
		System.out.println("프로그램 종료");
	}

}
