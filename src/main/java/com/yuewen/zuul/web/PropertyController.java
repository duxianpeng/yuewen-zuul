package com.yuewen.zuul.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class PropertyController {

	@Value("${from}")
	private String from;

	@RequestMapping("/from")
	public String from() {
		return from;
	}

	@RequestMapping("/test")
	public String test() {
		return "test";
	}

}
