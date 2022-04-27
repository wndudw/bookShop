package com.book.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.book.domain.BookKoVO;
import com.book.domain.CategoryVO;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.book.mappers.adminMapper";
	
	//카테고리
	@Override
	public List<CategoryVO> category() throws Exception {
		return sql.selectList(namespace + ".category");
	}

	//상품등록
	@Override
	public void register(BookKoVO vo) throws Exception {
		
		sql.insert(namespace + ".register" , vo);
		
	}

	//상품목록
	@Override
	public List<BookKoVO> list() throws Exception {

		return sql.selectList(namespace + ".list");
	}

	//상세보기
	@Override
	public BookKoVO view(int koNum) throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne(namespace + ".view", koNum);
	}

}
