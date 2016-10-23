package com.pitambar.controller;
import com.pitambar.service.AccountService;
import com.pitambar.exception.AccountNotFoundException;
import com.pitambar.exception.ProcessingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
 class InterestAction 
{
	private AccountService accountService;
	public void setAccountService(AccountService accountService)
	{
		this.accountService=accountService;
	}
	public void execute(HttpServletRequest req,HttpServletResponse res)throws AccountNotFoundException,ProcessingException
	{
		int ano=Integer.parseInt(req.getParameter("accno").trim());
		float interest=accountService.calculateInterest(ano);
		req.setAttribute("interest",interest);
	}
}