package com.chenlx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenlx on 2017/9/14.
 */
@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello(){
		return "Hello! SpringCloud Learn!";
	}

}
