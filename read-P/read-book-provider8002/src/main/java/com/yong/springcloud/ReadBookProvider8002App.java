package com.yong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class ReadBookProvider8002App {

	public static void main(String[] args)
	  {
	   SpringApplication.run(ReadBookProvider8002App.class, args);
	  }
}
