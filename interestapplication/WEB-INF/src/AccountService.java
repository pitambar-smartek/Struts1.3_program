package com.pitambar.service;
import com.pitambar.exception.AccountNotFoundException;
import com.pitambar.exception.ProcessingException;
public interface AccountService
{
	public float calculateInterest(int accno)throws AccountNotFoundException,ProcessingException;
}