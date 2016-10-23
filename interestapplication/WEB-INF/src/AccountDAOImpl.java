package com.pitambar.dao;
import com.pitambar.exception.AccountNotFoundException;
import com.pitambar.exception.DatabaseException;
import com.pitambar.dto.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.dao.DataAccessException;

public class AccountDAOImpl implements AccountDAO
{
	 private JdbcTemplate template;
	 public void setTemplate(JdbcTemplate template)
		{
			this.template=template;
		}
	public Account findAccount(int accno)throws AccountNotFoundException,DatabaseException
	{
		Account acc=null;
		try{
		 acc=(Account)template.queryForObject("select * from Account where accno=?",new Object[]{accno},new BeanPropertyRowMapper(Account.class));
		
		}catch(EmptyResultDataAccessException e)
		{
			throw new AccountNotFoundException();
		}catch(DataAccessException e)
		{
			throw new DatabaseException();
		}
		return acc;		
	}
	public void updateAccount(Account acc) throws DatabaseException,AccountNotFoundException
	{
		try{
		int re=template.update("update account  set name=?,balance=? where accno=?",new Object[]{acc.getName(),acc.getBalance(),acc.getAccno()});
		if(re!=1)
			throw new AccountNotFoundException();
		}catch(DataAccessException e)
		{
			throw new DatabaseException();
		}
	}
	public void deleteAccount(int accno)throws AccountNotFoundException,DatabaseException
	{
		try{
			int re=template.update("delete form account where accno=?",new Object[]{accno});
			if(re!=1)
				throw new AccountNotFoundException();	      
		}catch(DataAccessException e)
			{
			    throw new DatabaseException();
			}	
	}
	public void createAccount(Account acc)throws DatabaseException
	{
		try{
			int re=template.update("insert into account values(?,?,?)",new Object[]{acc.getAccno(),acc.getName(),acc.getBalance()});
		}catch(DataAccessException e)
		{
			throw new DatabaseException();
		}
	}
	
}