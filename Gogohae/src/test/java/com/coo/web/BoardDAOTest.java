package com.coo.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coo.dao.BoardDAO;
import com.coo.domain.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class BoardDAOTest {
	
	@Inject
	private BoardDAO dao;
	
	
	@Test
	public void createTest() throws Exception{
		
		BoardVO vo = new BoardVO();
		vo.setTitle("들어가주세요");
		vo.setContent("되면좋겟당");
		vo.setwriter("집에갈래");
		
		dao.create(vo);
	}

}
