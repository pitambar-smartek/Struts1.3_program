package com.pitambar.dto;
public class Account implements java.io.Serializable
{
	private int accno;
	private String name;
	private float balance;
	public void setAccno(int accno)
	{
		this.accno=accno;
	}
	public int getAccno()
	{
		return accno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setBalance(float balance)
	{
		this.balance=balance;
	}
	public float getBalance()
	{
		return balance;
	}
	
}
