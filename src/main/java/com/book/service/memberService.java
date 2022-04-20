package com.book.service;

import com.book.domain.MemberVO;

public interface memberService {

	//회원가입
	public void signup(MemberVO vo) throws Exception;
	
	public MemberVO signin(MemberVO vo) throws Exception;
}
