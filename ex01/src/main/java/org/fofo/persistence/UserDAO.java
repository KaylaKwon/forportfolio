package org.fofo.persistence;

import java.util.List;

import org.fofo.domain.UserVO;

public interface UserDAO {
	
	public void create(UserVO vo) throws Exception;
	
	public UserVO read(Integer uID) throws Exception;
	
	public void update(UserVO vo) throws Exception;
	
	public void delete(Integer uID) throws Exception;
	
	public List<UserVO> listAll() throws Exception;
	
}
