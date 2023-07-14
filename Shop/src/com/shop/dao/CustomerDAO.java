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
		
		CustomerVO vo = new CustomerVO();
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			psmt.setString(1, custId);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
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
