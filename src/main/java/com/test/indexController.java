package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration
@Controller
public class indexController {
	
	@RequestMapping("/")
	@ResponseBody
	public String first(){
		return "hello world!";
	}
	
	//入口
	public static void main(String[] args){
		SpringApplication.run(indexController.class, args);
	}
	
	
	
}
