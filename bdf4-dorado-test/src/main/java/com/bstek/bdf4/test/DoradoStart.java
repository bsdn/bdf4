package com.bstek.bdf4.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.bstek.dorado.web.boot.DoradoApplicationInitlizalizer;
//@Import(ApplicationContextConfiguration.class)
//@EnableAutoConfiguration//(exclude = {SecurityFilterAutoConfiguration.class, SpringBootWebSecurityConfiguration.class})
@EnableWebSecurity
@SpringBootApplication
public class DoradoStart {
	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(DoradoStart.class);
		DoradoApplicationInitlizalizer dai = new DoradoApplicationInitlizalizer();
		dai.initSpringApplication(app);
		app.run(args);
	}
}