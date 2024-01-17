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

import com.rubypaper.project.psd.PsdServiceImpl;
import com.rubypaper.project.psd.PsdVO;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class PsdController {

	@Autowired
	PsdServiceImpl  service;
	
	@Autowired
	HttpServletRequest  request;
	
	@GetMapping("PsdForm.do")
	 String PsdForm() {		
		System.out.println("===> 글 저장폼으로 이동");
	   return "/psd/PsdForm";		
	}
	
	@PostMapping("PsdFormOK.do" )
	 String PsdFormOK(PsdVO  vo) throws Exception, IOException {		
		String path = request.getSession().getServletContext().getRealPath("/psd/img/");
		System.out.println("path:" + path);		
		
		// 중복을 위한 시간부여
		long time = System.currentTimeMillis();
		SimpleDateFormat format = new SimpleDateFormat("HHmmss");
		String timeStr = format.format(time);
		
		MultipartFile file = vo.getFile(); // 파일
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
				
		vo.setImg(fileName);  // Table 에 파일 이름 저장.		
		service.psdInsert(vo);
		
	   return "redirect:getPsdList.do";		
	}
	
	@GetMapping("getPsdList.do")
	 String getBoardList(Model  model) {
		System.out.println("===>getPsdList.do ");		
		model.addAttribute("li", service.psdList());
	   return "/psd/getPsdList";		
	}	
	
	
	@GetMapping("deletePsd.do")
	 String deletePsd(Model  model , PsdVO  vo) {
		vo = service.getPsd(vo);
		String delFile = vo.getImg();
		String path = request.getSession().getServletContext().getRealPath("/psd/img/");
		File f = new File(path+delFile);
		if (!delFile.equals("space.png")) {
		   f.delete();	
		}		
		service.psdDelete(vo);
	   return "redirect:getPsdList.do";		
	}	
		
	
}
