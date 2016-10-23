package com.pitambar.controller;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import  org.springframework.context.ApplicationContext;
import com.pitambar.exception.AccountNotFoundException;
import com.pitambar.exception.ProcessingException;

public class FontController extends HttpServlet
{
	private ApplicationContext context;
	private InterestAction action;
	public void init()
	{
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	public void process(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		String responsePage="interestdetails.jsp";
		InterestAction action=(InterestAction)context.getBean("interestController");
		try{
			action.execute(req,res);
		}catch(AccountNotFoundException e)
		{
			responsePage="noaccount.jsp";
		}
		catch(ProcessingException e)
		{
			responsePage="problem.jsp";
		}
		req.getRequestDispatcher(responsePage).forward(req,res);
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		process(req,res);
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		process(req,res);
	}
}