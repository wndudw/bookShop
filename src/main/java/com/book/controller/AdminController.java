package com.book.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.book.domain.BookKoVO;
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
	@GetMapping("register")
	public void getBookList(Model model)throws Exception{
		logger.info("get bookList()");
		
		List<CategoryVO> category = null;
		category = service.category();
		model.addAttribute("category", JSONArray.fromObject(category));
		
	}

	//상품등록post
	@PostMapping("register")
	public String postBookRegister(BookKoVO vo) throws Exception {
		logger.info("상품등록 ");
		
		service.register(vo);
		
		return "redirect:/admin/index";
	}
	
	//상품목록get
	@GetMapping("list")
	public void getList(Model model) throws Exception{
		logger.info("상품 목록 get");
		
		List<BookKoVO> list = service.list();
		
		model.addAttribute("list", list);
	}
	
	//상품상세보기
	@GetMapping("view")
	public void getView(Model model, @RequestParam("n") int koNum) throws Exception{
		logger.info("상품 상세보기");
		
		BookKoVO goods = service.view(koNum);
		
		model.addAttribute("goods", goods);
	}
}
