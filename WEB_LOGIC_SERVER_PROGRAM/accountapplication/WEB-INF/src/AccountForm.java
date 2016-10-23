package com.pitambar.view;
import org.apache.struts.action.ActionForm;
public class AccountForm extends ActionForm{
	private int accno;
	public void setAccno(int accno){
		this.accno=accno;
	}
	public int getAccno(){
		return accno;
	}
}
