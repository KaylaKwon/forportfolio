package org.fofo.service;

import java.util.List;

import org.fofo.domain.PostVO;

public interface PostService {
	
	public void regist(PostVO post) throws Exception;
	
	public PostVO read(Integer postID) throws Exception;
	
	public void modify(PostVO post) throws Exception;
	
	public void remove(Integer postID) throws Exception;
	
	public List<PostVO> listAll() throws Exception;
}
