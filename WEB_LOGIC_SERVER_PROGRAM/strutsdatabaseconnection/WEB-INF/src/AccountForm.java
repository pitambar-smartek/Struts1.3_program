package com.pitambar.view;
import org.apache.struts.action.ActionForm;
public class AccountForm extends ActionForm{
	private String balance;
	public void setBalance(String balance){
		this.balance=balance;
	}
	public String getBalance(){
		return balance;
	}
}
