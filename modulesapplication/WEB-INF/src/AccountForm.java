package com.pitambar.admin.form;
import org.apache.struts.action.ActionForm;
public class AccountForm extends ActionForm
{
	private int accno;
	private String name;
	private double balance;
	public int getAccno()
	{
		return accno;
	}
	public void setAccno(int accno)
	{
		this.accno=accno;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}

}