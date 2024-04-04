package com.javatpoint.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import com.javatpoint.model.Account;

@Aspect
@Component
public class AccountAspect {
//implementing after returning advice     
	@AfterReturning(value = "execution(* com.javatpoint.service.impl.AccountServiceImpl.*(..))", returning = "account")
	public void afterReturningAdvice(JoinPoint joinPoint, Account account) {
		System.out.println("After Returing method:" + joinPoint.getSignature());
		System.out.println(account);
	}
}