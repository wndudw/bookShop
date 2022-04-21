package com.book.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.book.domain.MemberVO;

public class AdminInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object obj) throws Exception{
		
		HttpSession session = req.getSession();
		MemberVO member = (MemberVO) session.getAttribute("member");	
		
		//비로그인상태이면..
		if(member == null) {
			res.sendRedirect("/member/signin");
			return false;
		}
		
		//관리자가 아니면..
		if(member.getStatus() != 9) {
			res.sendRedirect("/");
			return false;
		}
		return true;
	}
}
