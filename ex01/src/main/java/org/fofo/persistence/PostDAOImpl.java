package org.fofo.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.fofo.domain.PostVO;

@Repository
public class PostDAOImpl implements PostDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "org.fofo.mapper.PostMapper";
	
	@Override
	public void create(PostVO vo) throws Exception{
		session.insert(namespace + ".create", vo);
	}
	
	@Override
	public PostVO read(Integer postID) throws Exception{
		return session.selectOne(namespace + ".read", postID);
	}
	
	@Override
	public void update(PostVO vo) throws Exception{
		session.update(namespace + ".update", vo);
	}
	
	@Override
	public void delete(Integer postID) throws Exception{
		session.delete(namespace + ".delete", postID);
	}
	
	@Override
	public List<PostVO> listAll() throws Exception{
		return session.selectList(namespace+".listAll");
	}
}

