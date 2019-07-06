package com.galebo.study.springcloud;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@RefreshScope
public class ClientController2 extends ClientController{

	@RequestMapping("/hehe")
	public String hehe(@RequestParam String name) {
		return "hehe";
	}
}
