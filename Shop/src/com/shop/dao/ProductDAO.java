package com.shop.dao;

import java.sql.DriverManager;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.ProductVO;

public class ProductDAO extends DBHelper {
	// 싱글톤
	private static ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	private ProductDAO() {};
	
	// 기본 CRUD 메서드
		public int insertProduct(ProductVO vo) {
			return 0;
		}
		public ProductVO selecttProduct(String prodNo) {
			return null;
		}
		public List<ProductVO> selectProducts() {
			List<ProductVO>
			
			try {
				conn = getConnection();
				stmt = conn.createStatement();
				rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
				
				while(rs.next()) {
					
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return null;
		}
		public int updateProduct(String prodNo) {
			return 0;
		}
		public int deleteProduct(String prodNo) {
			return 0;
		}
}
