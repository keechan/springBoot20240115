package com.rubypaper.project.shop;

import java.util.List;

public interface ShopService {
	int seq_ShopTbl0116();
	void shopInsert(ShopVO vo);
	List<ShopVO> shopList(ShopVO vo);
	ShopVO getShopEdit(ShopVO vo);
	
	void CartInsert(CartVO vo);
	void CartUpdate(CartVO vo);
	void CartDelete(CartVO vo);
	List<CartVO> CartList(CartVO vo);	
	CartVO getCartEdit(CartVO vo);
}
