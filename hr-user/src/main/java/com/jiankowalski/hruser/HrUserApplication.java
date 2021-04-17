package com.jiankowalski.hruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class HrUserApplication{

 	public static void main(String[] args) {
		SpringApplication.run(HrUserApplication.class, args);
	}

	
}
