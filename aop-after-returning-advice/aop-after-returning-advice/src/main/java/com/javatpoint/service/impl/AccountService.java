package com.javatpoint.service.impl;

import com.javatpoint.model.Account;

//creating interface that throws exception if the customer id not found   
public interface AccountService {
	public abstract Account getAccountByCustomerId(String customerId) throws Exception;
}