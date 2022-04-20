package com.book.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.book.domain.MemberVO;
import com.book.service.memberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	memberService service;
	
	@Autowired
	BCryptPasswordEncoder passEncoder;
	
	//회원가입 get
	@GetMapping("/signup")
	public void getSignup() throws Exception{
		logger.info("get signup()");
	}
	
	//회원가입 post
	@PostMapping("/signup")
	public String postSignup(MemberVO vo) throws Exception{
		logger.info("post signup()");
		
		String inputPass = vo.getUserPass();
		String pass = passEncoder.encode(inputPass);
		vo.setUserPass(pass);
		
		service.signup(vo);
		
		return "redirect:/";
	}
	
	//로그인 get
	@GetMapping("/signin")
	public void getSignin() throws Exception{
		logger.info("get signin()");
	}
	
	//로그인 post
	@PostMapping("/signin")
	public String postSignin(MemberVO vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception{
		logger.info("post signin()");

		HttpSession session = req.getSession();
		
		MemberVO login = service.signin(vo);
		
		boolean passMatch =passEncoder.matches(vo.getUserPass(), login.getUserPass());
		
		if(login != null && passMatch) {
			session.setAttribute("member", login);	
		} else {
			session.setAttribute("member", null);
			return "redirect:/member/signin";
		}
		
		return "redirect:/";
	}
	
	//로그아웃
	@GetMapping("/logout")
	public String logout(HttpSession session)throws Exception{
		logger.info("logout()");
		
		session.invalidate();
		
		return "redirect:/";
	}
}
