package com.proxy.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringProxyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProxyServerApplication.class, args);
	}

}
