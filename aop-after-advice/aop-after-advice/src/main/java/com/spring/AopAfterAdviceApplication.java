package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopAfterAdviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopAfterAdviceApplication.class, args);
	}

}
