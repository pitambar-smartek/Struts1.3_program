package com.pitambar.struts;
public class MyCounter 
{
	private int count;
	public MyCounter(int initialcount)
	{
		count=initialcount;
	}
	public void increment()
	{
		count++;
	}
	public int getCount()
	{
		return count;
	}
}
