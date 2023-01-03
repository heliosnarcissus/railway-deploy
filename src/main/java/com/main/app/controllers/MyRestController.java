package com.main.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("v1/api")
public class MyRestController {
	
	/*@GetMapping(value="/getInfo", produces="application/json")
	public List<Object> getInfo(){
		String url  = "https://randomuser.me/api";
		
		Object[] objects  = restTemplate.getForObject(url, Object[].class);
		
		return Arrays.asList(objects);
	}*/
	@GetMapping(value="/test")
	public String testConnectivity() {
		
		return "The Commuters NFT 2023";
	}
	

}
