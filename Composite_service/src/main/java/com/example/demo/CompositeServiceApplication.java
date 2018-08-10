package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients("com.example.client")
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.example.controller")
public class CompositeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompositeServiceApplication.class, args);
	}
}
