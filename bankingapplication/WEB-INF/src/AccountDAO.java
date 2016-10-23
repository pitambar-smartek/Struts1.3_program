package com.pitambar.dao;
import com.pitambar.exception.ProcessingException;
public interface AccountDAO
{
	public abstract void storeAccount(Account acc)throws ProcessingException;
	public abstract boolean deleteAccount(int ano);
	public abstract Account findAccount(int ano);
	public abstract void updateAccount(Account acc);
}