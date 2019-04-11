package com.yong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer
public class ReadEurekaServer7001App {
	public static void main(String[] args)
	  {
	   SpringApplication.run(ReadEurekaServer7001App.class, args);
	  }

}
