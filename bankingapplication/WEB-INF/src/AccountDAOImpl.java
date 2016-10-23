package com.pitambar.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.pitambar.dao.SessionUtil;
import com.pitambar.exception.ProcessingException;
public class AccountDAOImpl implements AccountDAO
{
	public void storeAccount(Account acc)throws ProcessingException
	{
		try{
		Session session=SessionUtil.getSession();
		Transaction tnx=session.beginTransaction();
		session.save(acc);
		tnx.commit();
		session.close();
		}catch(Exception e)
		{
			throw new ProcessingException();
		}
	}
	public  Account findAccount(int ano)
	{
		Account acc=null;
		Session session=SessionUtil.getSession();
		acc=(Account)session.get(Account.class,ano);
		session.close();
		return acc;
	}

	public boolean deleteAccount(int ano)
	{
		boolean flag=true;
		Session session=SessionUtil.getSession();
	
		Account acc=findAccount(ano);
		if(acc==null)
			flag=false;
		else{
		Transaction tnx=session.beginTransaction();
		session.delete(acc);
		tnx.commit();
		session.close();
		}
		return flag;
	}
	public void updateAccount(Account acc)
	{
		Session session=SessionUtil.getSession();
		Transaction tnx=session.beginTransaction();
		session.update(acc);
		tnx.commit();
		session.close();
	}
}