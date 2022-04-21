package com.book.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.book.domain.CategoryVO;
import com.book.service.AdminService;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/admin/*")
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Inject
	private AdminService service;
	
	//관리자화면
	@GetMapping("/index")
	public void getIndex() throws Exception{
		logger.info("get index()");
	}
	
	//도서등록 get
	@GetMapping("bookList")
	public void getBookList(Model model)throws Exception{
		logger.info("get bookList()");
		
		List<CategoryVO> category = null;
		category = service.category();
		model.addAttribute("category", JSONArray.fromObject(category));
		
	}

}
