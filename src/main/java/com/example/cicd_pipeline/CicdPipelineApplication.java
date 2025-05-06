package com.example.cicd_pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdPipelineApplication {
	public String welcome(){
		return "Welcome to Cloud Credits Technologies";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdPipelineApplication.class, args);
	}

}
