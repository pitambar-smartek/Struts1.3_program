package com.pitambar.struts;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import org.apache.struts.action.RequestProcessor;
import java.io.*;
public class MyRequestProcessor extends RequestProcessor
{
	public boolean processPreprocess(HttpServletRequest req,HttpServletResponse res)
	{
		String method=req.getMethod();
		if(method.equalsIgnoreCase("post"))
			return true;
		RequestDispatcher rd=req.getRequestDispatcher("failure.jsp");
		try{
			rd.forward(req,res);
		}catch(Exception e)
		{
		}
		return false;
	}
}