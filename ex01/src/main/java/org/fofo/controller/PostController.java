package org.fofo.controller;

import javax.inject.Inject;

import org.fofo.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/post/*")
public class PostController {
	private static final Logger logger = LoggerFactory.getLogger(PostController.class);
	
	@Inject
	private PostService service;
}
