package com.pitambar.view;
import org.apache.struts.action.ActionForm;

public class RegisterForm extends ActionForm
{
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}