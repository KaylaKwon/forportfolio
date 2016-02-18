package org.fofo.test;

import javax.inject.Inject;

import org.fofo.domain.PostVO;
import org.fofo.persistence.PostDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.ContextConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class PostDAOTest {
	
	private static final Logger logger = LoggerFactory.getLogger(PostDAOTest.class);
	
	@Inject
	private PostDAO dao;
	
	@Test
	public void testCreate() throws Exception{
		PostVO post = new PostVO();
		post.setBoardId(1);
		post.setUserId(1);
		post.setPostTitle("���ο� ���� �ֽ��ϴ�.");
		post.setPostContent("���ο� ���� �־�");
	}
	
	@Test
	public void testRead() throws Exception{
		logger.info(dao.read(1).toString());
	}
	
	@Test
	public void testUpdate() throws Exception{
		PostVO post = new PostVO();
		post.setPostId(1);
		post.setPostTitle("������ ���Ӵ�");
		post.setPostContent("���� ");
		dao.update(post);
	}
	
	@Test
	public void testDelete() throws Exception{
		dao.delete(1);
	}
}