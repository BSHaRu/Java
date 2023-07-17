package com.shop.dao;

import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.CustomerVO;

public class CustomerDAO extends DBHelper {

	private static CustomerDAO instance = new CustomerDAO();
	
	public static CustomerDAO getInstance() {
		return instance;
	}
	private CustomerDAO() {}
	
	// 기본 CRUD 메서드
	public int insertCustomer(CustomerVO vo) {
		
		int result = 0;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			psmt.setString(1, vo.getCustId());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getHp());
			psmt.setString(4, vo.getAddr());
			
			result = psmt.executeUpdate();
			close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return result;
	}
	
	public CustomerVO selectCustomer(String custId) {
		// new 생성자로 초기화 하면
		// vo에 해당하는 필드 값들이 모두 null로 잡힘
		// vo를 null로 초기화 하면
		// vo.필드값을 하게되면 NullPoint가 뜨게 됨
		// -> 해당 vo를 어떻게 쓰는가에 따라 
		// null로 초기화하던, new 생성자로 초기화하면 됨
		// => 여기에서는 null로 초기화 안하면 main에서 else에 안걸림
		// new로 하면 null님 어서오세요가 됨
		// ※ null로 초기화하고 나서 반드시 쿼리문 실행 후
		// new로 생성자 초기화 해줘야됨
		CustomerVO vo = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			psmt.setString(1, custId);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new CustomerVO();
				vo.setCustId(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAddr(rs.getString(4));
				vo.setRdate(rs.getString(5));
			}
			close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return vo;
	}
	
	public List<CustomerVO> selectCustomers() {
		
		return null;
	}
	
	public int updateCustomer(CustomerVO vo) {
		
		return 0;
	}
	
	public int deleteCustomer(String custId) {
		
		return 0;
	}
}
