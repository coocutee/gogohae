package com.coo.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.coo.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.coo.mapper.BoardMapper";


	@Override
	public void create(BoardVO vo) {
		sqlSession.insert(namespace+".create",vo);
		
	}

}
