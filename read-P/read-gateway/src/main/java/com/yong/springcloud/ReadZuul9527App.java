package com.yong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@SpringBootApplication
@EnableZuulProxy
public class ReadZuul9527App {
	public static void main(String[] args)
	  {
	   SpringApplication.run(ReadZuul9527App.class, args);
	  }

}
