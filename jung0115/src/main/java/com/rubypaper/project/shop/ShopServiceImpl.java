package com.rubypaper.project.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	private ShopDao  dao;
	
	@Override
	public int seq_ShopTbl0116() {		
		return dao.seq_ShopTbl0116();
	}

	@Override
	public void shopInsert(ShopVO vo) {
		dao.shopInsert(vo);		
	}

	@Override
	public List<ShopVO> shopList(ShopVO vo) {		
		return dao.shopList(vo);
	}

	@Override
	public ShopVO getShopEdit(ShopVO vo) {
		return dao.getShopEdit(vo);
	}

	@Override
	public void CartInsert(CartVO vo) {
		dao.CartInsert(vo);
		
	}

	@Override
	public void CartDelete(CartVO vo) {
		dao.CartDelete(vo);
		
	}

	@Override
	public List<CartVO> CartList(CartVO vo) {
		return dao.CartList(vo);
	}

	@Override
	public CartVO getCartEdit(CartVO vo) {
		return dao.getCartEdit(vo);
	}

	@Override
	public void CartUpdate(CartVO vo) {
		dao.CartUpdate(vo);		
	}

}
