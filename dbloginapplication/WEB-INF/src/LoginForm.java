package com.pitambar.view;
import org.apache.struts.action.ActionForm;
public class LoginForm extends ActionForm
{
	private String username,password;
	public void setUsername(String username)
	{
		this.username=username;
	}
	public String getUsername()
	{
		return username;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getPassword()
	{
		return password;
	}
}