package com.book.service;

import java.util.List;

import com.book.domain.BookKoVO;
import com.book.domain.CategoryVO;

public interface AdminService {
	
	public List<CategoryVO> category() throws Exception;
	
	public void register(BookKoVO vo) throws Exception;
	
	public List<BookKoVO> list() throws Exception;

	public BookKoVO view(int koNum) throws Exception;
}
