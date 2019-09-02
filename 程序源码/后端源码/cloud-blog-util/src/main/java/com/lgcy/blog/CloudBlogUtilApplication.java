package com.lgcy.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class CloudBlogUtilApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudBlogUtilApplication.class, args);
	}

}
