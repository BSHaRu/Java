package com.shop.db;

public class SQL {

	// customer
	public static final String SELECT_CUSTOMER
		= "SELECT * FROM Customer WHERE custId = ?";
	
	public static final String INSERT_CUSTOMER
		= "INSERT INTO Customer SET "
				+ " custId = ?, "
				+ " name = ?, "
				+ " hp = ?, "
				+ " addr = ?, "
				+ " rdate = NOW()";
	
	public static final String SELECT_CUSTOMERS
		= "";
	
	public static final String UPDATE_CUSTOMER
		= "";
	
	public static final String DELETE_CUSTOMER
		= "";
	
	
	// Order
	public static final String INSERT_ORDER
		= "INSERT INTO `Order` SET "
				+ " orderId = ?, "
				+ " orderProduct = ?,"
				+ " orderCount = ?, "
				+ " orderDate = NOW()";
	
	public static final String SELECT_ORDER
		= "";
	
	public static final String SELECT_ORDERS
		= "SELECT o.*, c.name, p.prodName "
			+ " FROM `Order` AS o "
			+ " JOIN Customer AS c "
				+ " ON o.orderId = c.custId "
			+ " JOIN Product AS p "
				+ " ON o.orderProduct = p.prodNo"
			+ " WHERE orderID = ? ";
	
	public static final String UPDATE_ORDER
		= "";
	
	public static final String DELETE_ORDER
		= "";

	
	
	public static final String SELECT_PRODUCTS
		= "SELECT * FROM Product WHERE stock > 0";

	public static final String SELECT_PRODUCT 
		= "SELECT * FROM Product WHERE custId = ?";

	public static final String UPDATE_PRODUCT_STOCK 
		= "UPDATE Product SET "
				+ "	stock = stock - ? "
				+ " WHERE prodNo = ? ";
}
