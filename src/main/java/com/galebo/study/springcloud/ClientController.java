package com.galebo.study.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ClientController {
	@Value("${server.port}")
	private String port;
	@Value("${word}")
	private String word;

	@RequestMapping("/hello")
	public String index(@RequestParam String name) {
		return name + "," + this.word+ "," +this.port;
	}
}
