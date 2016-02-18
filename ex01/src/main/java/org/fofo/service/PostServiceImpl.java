package org.fofo.service;
/*서비스 계층 -> 사용자 요구사항에 대한 기능*/
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
	public PostVO read(Integer postID) throws Exception{
		return dao.read(postID);
	}
	
	@Override
	public void modify(PostVO post) throws Exception{
		dao.update(post);
	}
	
	@Override
	public void remove(Integer postID) throws Exception{
		dao.delete(postID);
	}
	
	@Override
	public List<PostVO> listAll() throws Exception{
		return dao.listAll();
	}
}






