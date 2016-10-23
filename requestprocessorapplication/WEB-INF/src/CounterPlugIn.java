package com.pitambar.struts;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.struts.config.*;
import org.apache.struts.action.*;
public class CounterPlugIn implements PlugIn
{
	private int initailcount;
	ActionServlet servlet;
	ModuleConfig config;
	public void init(ActionServlet servlet ,ModuleConfig config)
	{
		this.servlet=servlet;
		this.config=config;
		System.out.println("Initializing the Counter with the Initial Count as"+initailcount);
		MyCounter mc=new MyCounter(initailcount);
		ServletContext sc=servlet.getServletContext();
		sc.setAttribute("counter",mc);
		mc.increment();
	}
	public void destroy()
	{
		ServletContext sc=servlet.getServletContext();
		sc.removeAttribute("counter");
	}
	public void setInitialCount(int i)
	{
		initailcount=i;
	}
}