package com.practice.Controller;

import org.springframework.web.bind.annotation.*;
/*if you return a String from a controller method, Spring treats it as a view name 
 * (e.g., returns home → tries to load home.html or home.jsp).

But if you want to return raw data (like JSON, XML, plain text, or even HTML fragments), you use @ResponseBody.*/

@RestController // is the combination of @Controller and @ResponseBody
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public String helloworld() {
		return "Hello World!";
	}
	
}
