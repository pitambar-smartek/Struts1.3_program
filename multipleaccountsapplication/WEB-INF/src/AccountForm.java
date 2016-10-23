package com.pitambar.view;
import org.apache.struts.action.ActionForm;
public class  AccountForm extends ActionForm
{
	private String balrange;
	public void setBalrange(String balrange)
	{
		this.balrange=balrange;
	}
	public String getBalrange()
	{
		return balrange;
	}
}
