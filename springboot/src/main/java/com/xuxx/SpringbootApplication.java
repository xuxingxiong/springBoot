package com.xuxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.xuxx.config.HashConfig;

@Controller
@SpringBootApplication
@EnableConfigurationProperties(HashConfig.class)
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
