package com.wfz.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class Test {

	@RequestMapping("/getTest")
	@ResponseBody
	public String getTest(HttpServletRequest request, HttpServletResponse response){
		
		System.out.println("123");
		return "123";
	}
}
