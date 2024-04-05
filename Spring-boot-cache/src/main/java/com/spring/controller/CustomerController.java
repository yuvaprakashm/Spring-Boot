package com.spring.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Customer;

@RestController
public class CustomerController {
	@RequestMapping("/customerinfo")
	@Cacheable(value = "customerInfo")
	public List customerInformation() {
		System.out.println("customer information from cache");
		List detail = Arrays.asList(new Customer(5026890,"yuvi","Current A/C",450000.00),new Customer(7620015,"prakash","Saving A/C",210089.00));
		return detail;
	}
}
