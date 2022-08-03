package org.aptech.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/home")
	  public String home() {
	  return "Welcome to Home Page";
		}
	
	@GetMapping("/dashboard")
	  public String  dashboard() {
		return "Welcome to Home Page";
	    }
	}

