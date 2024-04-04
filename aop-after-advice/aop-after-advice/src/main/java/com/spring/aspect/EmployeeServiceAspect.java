package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {
	@After(value = "execution(* com.spring.service.EmployeeService.*(..)) and args(empId, fname, sname)")
	public void afterAdvice(JoinPoint joinPoint, String empId, String fname, String sname) {
		System.out.println("After method:" + joinPoint.getSignature());
		System.out.println(
				"Creating Employee with first name - " + fname + ", second name - " + sname + " and id - " + empId);
	}
}
