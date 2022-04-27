package com.book.dao;

import java.util.List;

import com.book.domain.BookKoVO;
import com.book.domain.CategoryVO;

public interface AdminDAO {

	//카테고리
	public List<CategoryVO> category() throws Exception;
	
	public void register(BookKoVO vo) throws Exception;
	
	public List<BookKoVO> list() throws Exception;
	
	public BookKoVO view(int koNum) throws Exception;
}
