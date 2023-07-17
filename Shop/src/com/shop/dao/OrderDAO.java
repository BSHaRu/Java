package com.shop.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.OrderVO;

public class OrderDAO extends DBHelper {

	private static OrderDAO instance = new OrderDAO();
	
	public static OrderDAO getInstance() {
		return instance;
	}
	private OrderDAO() {}
	
	
	public int insertOrder(OrderVO vo) {
		int result = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_ORDER);
			psmt.setString(1, vo.getOrderId());
			psmt.setInt(2, vo.getOrderProduct());
			psmt.setInt(3, vo.getOrderCount());
			
			result = psmt.executeUpdate();
			close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public OrderVO selectOrder(int orderNo) {
		
		return null;
	}
	
	public List<OrderVO> selectOrders(String orderId) {
		List<OrderVO> list = new ArrayList<>();
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_ORDERS);
			psmt.setString(1, orderId);
			
			rs = psmt.executeQuery();
			while(rs.next()) {
				OrderVO vo = new OrderVO();
				vo.setOrderNo(rs.getInt(1));
				vo.setOrderId(rs.getString(2));
				vo.setOrderProduct(rs.getInt(3));
				vo.setOrderCount(rs.getInt(4));
				// 날짜를 가져오는데 시,분까지만 가져올꺼임
				// substring이 java에서는 인덱스 번호지만,
				// sql에서는 시작번호임 잘 구별 하셈
				vo.setOrderDate(rs.getString(5).substring(0, 16));
				vo.setName(rs.getString(6));
				vo.setProdName(rs.getString(7));
				
				list.add(vo);
			}
			close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int updateOrder(OrderVO vo) {
		
		return 0;
	}
	
	public int deleteOrder(int orderNo) {
		
		return 0;
	}
	
}
