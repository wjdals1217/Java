package com.shop.db;

public class SQL {
	
	// CUSTOMER
	public static final String INSERT_CUSTOMER 	= "INSERT INTO `Customer` VALUES (?,?,?,?,NOW())";
	public static final String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custId`=?";

	// ORDER
	
	// PRODUCT
	public static final String SELECT_PRODUCTS = "SELECT * FROM	`Product`;";
}
