package com.shop.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.ProductVO;

public class ProductDAO extends DBHelper {
	
	private static ProductDAO instance = new ProductDAO();
	
	public static ProductDAO getInstance() {
		return instance;
	}
	private ProductDAO() {}
	
	
	public void insertProduct(ProductVO vo) {
		
	}
	
	public ProductVO selectProduct(int prodNo) {
		ProductVO vo = null; 
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_PRODUCT);
			psmt.setInt(1, prodNo);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new ProductVO();
				vo.setProdNo(rs.getInt(1));
				vo.setProdName(rs.getString(2));
				vo.setStock(rs.getInt(3));
				vo.setPrice(rs.getInt(4));
				vo.setCompany(rs.getString(5));
			}
			close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return vo;
	}
	
	public List<ProductVO> selectProducts() {
		List<ProductVO> prod = new ArrayList<>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
			
			while(rs.next()) {
				ProductVO vo = new ProductVO();

				vo.setProdNo(rs.getInt("prodNo"));
				vo.setProdName(rs.getString("prodName"));
				vo.setStock(rs.getInt("stock"));
				vo.setPrice(rs.getInt("price"));
				vo.setCompany(rs.getString("company"));
				
				prod.add(vo);
			}
			close();
		} catch (ClassNotFoundException e) {
			System.out.println("slectProduct01 : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("slectProduct02 : " + e.getMessage());
		}
		return prod;
	}
	
	public int updateProduct(ProductVO vo) {
		
		return 0;
	}
	
	public void updateProductStock(int prodNo, int prodCount) {
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_PRODUCT_STOCK);
			psmt.setInt(1, prodCount);
			psmt.setInt(2, prodNo);
			
			psmt.executeUpdate();
			
			close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int insertProduct(int prodNo) {
		
		return 0;
	}
	
}
