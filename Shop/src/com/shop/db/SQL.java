package com.shop.db;

public class SQL {
	
	// CUSTOMER
	public static final String INSERT_CUSTOMER 	= "INSERT INTO `Customer` VALUES (?,?,?,?,NOW())";
	public static final String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custId`=?";

	// ORDER
	public static final String SELECT_ORDERS = "SELECT "
											 +"a.*, "
											 + "b.`name`, "
											 + "c.`prodName` "
											 + "FROM `Order` As a "
											 + "JOIN `Customer` AS b ON	a.orderId = b.custId "
											 + "JOIN `Product` AS c ON a.orderProduct = c.prodNo "
											 + "WHERE `orderId`= ?";
	
	
	public static final String INSERT_ORDER = "INSERT INTO `Order` SET "
											+ "`OrderId`=?, "
											+ "`OrderProduct`=?, "
											+ "`OrderCount`=?, "
											+ "`OrderDate`=NOW()"; 
	
	
	// PRODUCT
	public static final String SELECT_PRODUCTS = "SELECT * FROM	`Product` WHERE `stock` > 0;";
	public static final String SELECT_PRODUCT = "SELECT * FROM `Product` WHERE `prodNo` = ?  ";
	public final static String UPDATE_PRODUCT_STOCK_COUNT = "UPDATE `Product` SET `stock`=`stock` - ? WHERE `prodNo`= ? ";
}
