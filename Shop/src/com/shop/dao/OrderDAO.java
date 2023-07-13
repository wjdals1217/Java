package com.shop.dao;

import java.util.List;

import com.shop.db.DBHelper;
import com.shop.vo.OrderVO;

public class OrderDAO extends DBHelper {

	// 싱글톤
	private static OrderDAO instance = new OrderDAO();
	public static OrderDAO getInstance() {
		return instance;
	}
	private OrderDAO() {};
	
	// 기본 CRUD 메서드
	public int insertOrder(OrderVO vo) {
		return 0;
	}	
	public OrderVO selectOrder(String orderNo) {
		return null;
	}	
	public List<OrderVO> selectOrders() {
		return null;
	}	
	public int updateOrder(String orderNo) {
		return 0;
	}	
	public int delete(String orderNo) {
		return 0;
	}	
}
