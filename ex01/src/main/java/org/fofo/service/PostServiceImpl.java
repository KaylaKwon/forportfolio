package org.fofo.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.fofo.domain.PostVO;
import org.fofo.persistence.PostDAO;

@Service
public class PostServiceImpl implements PostService{
	
	@Inject
	private PostDAO dao;
	
	@Override
	public void regist(PostVO post) throws Exception{
		dao.create(post);
	}
	
	@Override
	public PostVO read(Integer postId) throws Exception{
		return dao.read(postId);
	}
	
	@Override
	public void modify(PostVO post) throws Exception{
		dao.update(post);
	}
	
	@Override
	public void remove(Integer postId) throws Exception{
		dao.delete(postId);
	}
	
	@Override
	public List<PostVO> listAll() throws Exception{
		return dao.listAll();
	}
}






