package com.book.dao;

import java.util.List;

import com.book.domain.CategoryVO;

public interface AdminDAO {

	//카테고리
	public List<CategoryVO> category() throws Exception;
}
