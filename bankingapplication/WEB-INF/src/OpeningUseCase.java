package com.pitambar.model;
import com.pitambar.dao.AccountDAO;
import com.pitambar.dao.Account;
import com.pitambar.dao.AccountDAOImpl;
import com.pitambar.dao.DAOFactory;
import com.pitambar.exception.ProcessingException;
public class OpeningUseCase
{		
		public void openingAccount(Account acc)throws ProcessingException
                                   {

		AccountDAO dao=DAOFactory.getAccountDAO();
		try{
		  dao.storeAccount(acc);
		}catch(ProcessingException e)
									   {
			throw  e;
									   }
		
                                 }
		
	
}
