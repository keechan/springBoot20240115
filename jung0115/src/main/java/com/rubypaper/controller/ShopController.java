package com.rubypaper.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.rubypaper.project.shop.ShopServiceImpl;
import com.rubypaper.project.shop.ShopVO;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ShopController {

	@Autowired
	ShopServiceImpl  service;
	
	@Autowired
	HttpServletRequest  request;
	
	
	@GetMapping("ShopForm.do")
	 String ShopForm(Model  model) {		
		model.addAttribute("seq", service.seq_ShopTbl0116());
	   return "/shop/ShopForm";		
	}
	
	@PostMapping("ShopFormOK.do")
	 String ShopFormOK(ShopVO vo ) throws Exception, IOException {		

		String path = request.getSession().getServletContext().getRealPath("/shop/img/");
		System.out.println("path:" + path);		
		
		// 중복을 위한 시간부여
		long time = System.currentTimeMillis();
		SimpleDateFormat format = new SimpleDateFormat("HHmmss");
		String timeStr = format.format(time);
		
		MultipartFile file = vo.getProductFile(); // 파일
		String fileName = file.getOriginalFilename();
		File f = new File(path + fileName); // 경로 안에 있는 파일
		if(!file.isEmpty()) {
			if(f.exists()) {
				String onlyFileName = fileName.substring(0,fileName.lastIndexOf("."));
				String ext = fileName.substring(fileName.lastIndexOf("."));
				fileName = onlyFileName +"_" +timeStr +ext;
			}
			// 실제 파일 저장
			file.transferTo(new File(path + fileName));	
		}else {
			fileName = "space.png";
		}
				
		vo.setProductImg(fileName);  // Table 에 파일 이름 저장.		
		service.shopInsert(vo);
		
	   return "redirect:getShopList.do";		
	}
	
	@GetMapping("getShopList.do")
	 String getShopList(Model  model, ShopVO vo ) {		
		model.addAttribute("li", service.shopList(vo));
	   return "/shop/getShopList";		
	}
		
	@GetMapping("getShopEdit.do")
	 String getShopEdit(Model  model, ShopVO vo ) {			
		model.addAttribute("m", service.getShopEdit(vo));
	   return "/shop/getShopEdit";		
	}
}
