package com.book.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.book.domain.MemberVO;
import com.book.service.memberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	memberService service;
	
//	@Autowired
//	BCryptPasswordEncoder passEncoder;
	
	//회원가입 get
	@GetMapping("/signup")
	public void getSignup() throws Exception{
		logger.info("get signup()");
	}
	
	//회원가입 post
	@PostMapping("/signup")
	public String postSignup(MemberVO vo) throws Exception{
		logger.info("post signup()");
		
		service.signup(vo);
		
		return "redirect:/";
	}
}
