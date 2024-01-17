package com.rubypaper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rubypaper.project.shop.CartVO;
import com.rubypaper.project.shop.ShopServiceImpl;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CartController {

	@Autowired
	ShopServiceImpl  service;
	
	@Autowired
	HttpServletRequest  request;
	
	@Autowired
	HttpSession session; 
	
	@GetMapping("getCartList.do")
	 String getCartList(Model  model, CartVO vo ) {	
		
		String sessionID2 =(String) session.getAttribute("sessionID2");
		System.out.println("===> sessionID2:"+ sessionID2);
		
		if (sessionID2 == null || sessionID2.equals("null")) {
			vo.setSessionID("");
		}else{
			vo.setSessionID(sessionID2);	
		}			
		model.addAttribute("li", service.CartList(vo));
	   return "/shop/getCartList";		
	}
		
	@GetMapping("ShoppingOK.do")
	 String getShopEdit(Model  model, CartVO vo ) {
		
		HttpSession sessionID = request.getSession();
		String sessionid =sessionID.toString();
		sessionid = sessionid.substring(sessionid.lastIndexOf("@"));
		
		session.setAttribute("sessionID2", sessionid);
		
		vo.setSessionID(sessionid);
		CartVO	 CK = service.getCartEdit(vo);
		if ( CK == null ) {
			vo.setSessionID(sessionid);
			service.CartInsert(vo);	
		}else {
			service.CartUpdate(vo);
		}
	   return "redirect:getCartList.do";			
	}
	
	@GetMapping("sessionLogOut.do")
	 String sessionLogOut(Model  model, CartVO vo ) {		
		 session.invalidate();			
	   return "redirect:index.do";		
	}
			
		
}
