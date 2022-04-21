package com.book.service;

import java.util.List;

import com.book.domain.CategoryVO;

public interface AdminService {
	
	public List<CategoryVO> category() throws Exception;

}
