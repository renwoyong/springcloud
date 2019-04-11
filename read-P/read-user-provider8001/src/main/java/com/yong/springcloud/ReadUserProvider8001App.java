package com.yong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class ReadUserProvider8001App {
	public static void main(String[] args)
	  {
	   SpringApplication.run(ReadUserProvider8001App.class, args);
	  }

}
