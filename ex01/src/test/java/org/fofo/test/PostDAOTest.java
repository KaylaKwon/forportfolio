package org.fofo.test;

import javax.inject.Inject;

import org.fofo.persistence.PostDAO;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class PostDAOTest {
	@Inject
	private PostDAO dao;
}
