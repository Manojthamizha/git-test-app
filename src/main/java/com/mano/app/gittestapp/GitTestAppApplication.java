package com.mano.app.gittestapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitTestAppApplication {
	
	public String purchase(@PathVariable String userName, @PathVariable double amount, @PathVariable String productName) {
		return "Hi " + userName + " order for " + productName + " with amount " + amount + " stored successfully...";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitTestAppApplication.class, args);
	}

}
