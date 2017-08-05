package com.xuxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class SpringbootApplication {

	@GetMapping(value = "/login")
	public String login() {
		return "/login";
	}

	@GetMapping(value = "/index")
	public String index() {
		return "/index";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
