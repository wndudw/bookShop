package com.book.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.book.dao.AdminDAO;
import com.book.domain.BookKoVO;
import com.book.domain.CategoryVO;

@Service
public class AdminServiceImpl implements AdminService {

	@Inject
	private AdminDAO dao;
	
	//카테고리
	@Override
	public List<CategoryVO> category() throws Exception {
		
		return dao.category();
	}

	
	//상품등록
	@Override
	public void register(BookKoVO vo) throws Exception {
		
		dao.register(vo);
		
	}


	//상품목록
	@Override
	public List<BookKoVO> list() throws Exception {

		return dao.list();
	}

	//상세보기
	@Override
	public BookKoVO view(int koNum) throws Exception {

		return dao.view(koNum);
	}

}
