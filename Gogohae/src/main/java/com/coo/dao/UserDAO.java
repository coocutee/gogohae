package com.coo.dao;

import com.coo.domain.UserVO;

public interface UserDAO {
	
	public String getTime();
	
	public void createUser(UserVO vo);

}
