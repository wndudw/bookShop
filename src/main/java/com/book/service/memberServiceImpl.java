package com.book.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.book.dao.MemberDAO;
import com.book.domain.MemberVO;

@Service
public class memberServiceImpl implements memberService {

	@Inject
	private MemberDAO dao;
	
	//회원가입
	@Override
	public void signup(MemberVO vo) throws Exception {
		
		dao.signup(vo);
		
	}

}
