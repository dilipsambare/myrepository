package com.example.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController implements ErrorController{
	@RequestMapping("/testing")
	@ResponseBody
	public String displayMessage() {
		return "<center><h4><font color='blue'>This is the first spring boot microservice!!</font></h4></center>";
	}

	@Override
	@RequestMapping("/error")
	@ResponseBody
	public String getErrorPath() {
		return "<center><h4><font color='red'>Something went wrong</font></h4></center>";
	}
}
