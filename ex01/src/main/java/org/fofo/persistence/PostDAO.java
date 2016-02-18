package org.fofo.persistence;

import java.util.List;

import org.fofo.domain.PostVO;


public interface PostDAO {
	
	public void create(PostVO vo) throws Exception;
	
	public PostVO read(Integer postID) throws Exception;
	
	public void update(PostVO vo) throws Exception;
	
	public void delete(Integer postID) throws Exception;
	
	public List<PostVO> listAll() throws Exception;
}
