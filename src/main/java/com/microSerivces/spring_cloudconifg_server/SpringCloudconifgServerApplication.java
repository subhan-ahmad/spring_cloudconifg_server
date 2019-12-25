package com.microSerivces.spring_cloudconifg_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@SpringBootApplication
@EnableConfigServer
public class SpringCloudconifgServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudconifgServerApplication.class, args);
	}

}
