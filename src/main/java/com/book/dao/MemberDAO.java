package com.book.dao;

import com.book.domain.MemberVO;

public interface MemberDAO {

	//회원가입
	public void signup(MemberVO vo) throws Exception;
}
