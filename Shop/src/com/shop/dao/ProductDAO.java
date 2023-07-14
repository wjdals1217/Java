package com.shop.dao;

import java.util.ArrayList;
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
		public ProductVO selectProduct(String prodNo) {
			
			ProductVO vo = new ProductVO();
			
			try {
				conn = getConnection();
				psmt = conn.prepareStatement(SQL.SELECT_PRODUCT);
				psmt.setInt(1, vo.getProdNo());
				
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
			} catch (Exception e) {
				e.printStackTrace();
			}
			return vo;
		}
		public List<ProductVO> selectProducts() {
			List<ProductVO> products = new ArrayList<>();
			
			try {
				conn = getConnection();
				stmt = conn.createStatement();
				rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
				
				while(rs.next()) {
					
					ProductVO vo = new ProductVO();
					vo.setProdNo(rs.getInt(1));
					vo.setProdName(rs.getString(2));
					vo.setStock(rs.getInt(3));
					vo.setPrice(rs.getInt(4));
					vo.setCompany(rs.getString(5));
					
					products.add(vo);
				}
				close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return products;
		}
		public int updateProduct(String prodNo) {
			return 0;
		}
		
		public void updateProductStockCount(int prodNo, int prodCount) {
			
			try {
				conn = getConnection();
				psmt = conn.prepareStatement(SQL.UPDATE_PRODUCT_STOCK_COUNT);
				psmt.setInt(1, prodCount);
				psmt.setInt(2, prodNo);
				
				psmt.executeUpdate();
				
				close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		public int deleteProduct(String prodNo) {
			return 0;
		}
}
