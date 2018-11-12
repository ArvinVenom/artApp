package com.qbao.sdk.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController extends BaseController {

	@RequestMapping("/testPage")
	public String testJson() {
		
		return "index.page";
	}
}
