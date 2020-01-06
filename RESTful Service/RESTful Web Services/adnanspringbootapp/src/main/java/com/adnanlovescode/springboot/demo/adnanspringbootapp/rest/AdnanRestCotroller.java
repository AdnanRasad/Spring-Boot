package com.adnanlovescode.springboot.demo.adnanspringbootapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdnanRestCotroller {

	private String user;
	
	@GetMapping("/")
	private String sayHello() {
		return "Hello World! Time on Server is "+ LocalDateTime.now();
	} 
	
	@RequestMapping("/user")
	  public String greeting(@RequestParam(value="name") String name) {
	    return "Hello "+name+"!"+"Time on Server is "+ LocalDateTime.now();
	  }
	
}
