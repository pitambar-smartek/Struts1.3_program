package com.pitambar.dao;
import com.pitambar.dto.Account;
import com.pitambar.exception.DatabaseException;
import com.pitambar.exception.AccountNotFoundException;
public interface AccountDAO
{
	public Account findAccount(int accno)throws AccountNotFoundException,DatabaseException;
	public void updateAccount(Account acc) throws DatabaseException,AccountNotFoundException;
	public void deleteAccount(int accno)throws AccountNotFoundException,DatabaseException;
	public void createAccount(Account acc)throws DatabaseException;
}