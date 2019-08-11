package com.spring.okta.oauth.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Reference: https://developer.okta.com/blog/2019/03/12/oauth2-spring-security-guide#create-an-openid-connect-application
@SpringBootApplication
public class SpringOktaOauthExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOktaOauthExampleApplication.class, args);
	}

}
