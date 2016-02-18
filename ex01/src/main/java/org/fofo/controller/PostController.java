package org.fofo.controller;

import javax.inject.Inject;

import org.fofo.domain.PostVO;
import org.fofo.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/post/*")
public class PostController {
	private static final Logger logger = LoggerFactory.getLogger(PostController.class);
	
	@Inject
	private PostService service;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(PostVO post, Model model) throws Exception{
		logger.info("register get~~~~~~~~~~~~~~~");
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registPOST(PostVO post, Model model) throws Exception{
		logger.info("register post~~~~~~~~~~~~~~~~~");
		logger.info(post.toString());
		
		service.regist(post);
		
		model.addAttribute("result", "success");
		return "/board/success";
	}
	
	
}
