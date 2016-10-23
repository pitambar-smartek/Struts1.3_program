package com.pitambar.service;
import com.pitambar.dao.AccountDAO;
import com.pitambar.exception.AccountNotFoundException;
import com.pitambar.exception.ProcessingException;
import com.pitambar.exception.DatabaseException;
import com.pitambar.dto.Account;
public class AccountServiceImpl implements AccountService
{
	private AccountDAO accountDAO;
	public void setAccountDAO(AccountDAO accountDAO)
	{
		this.accountDAO=accountDAO;
	}
	public float calculateInterest(int accno)throws AccountNotFoundException,ProcessingException
	{
		float interest=0.0f;
		   try{
			Account acc=accountDAO.findAccount(accno);
			float balance=acc.getBalance();
			interest=balance*0.06f;
		   }catch(DatabaseException e)
		{
			   throw new ProcessingException();
		}
		
		
		return interest;
	}//Business method
}//Business component