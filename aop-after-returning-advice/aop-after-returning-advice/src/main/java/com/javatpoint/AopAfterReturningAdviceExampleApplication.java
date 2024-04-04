package com.javatpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import com.javatpoint.model.Account;
import com.javatpoint.service.impl.AccountService;
import com.javatpoint.service.impl.AccountServiceImpl;

@SpringBootApplication
//@EnableAspectJAutoProxy annotation enables support for handling the components marked with @Aspect annotation. It is similar to tag in the xml configuration.  
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopAfterReturningAdviceExampleApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(AopAfterReturningAdviceExampleApplication.class,
				args);
//Fetching the account object from the application context  
		AccountService accountService = ac.getBean("accountServiceImpl", AccountServiceImpl.class);
		Account account;
		try {
			account = accountService.getAccountByCustomerId("K2434567");
			if (account != null)
				System.out.println(account.getAccountNumber() + "\t" + account.getAccountType());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}