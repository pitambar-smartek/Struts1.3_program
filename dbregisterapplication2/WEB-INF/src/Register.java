package com.pitambar.dto;
public class Register implements java.io.Serializable
{
	private String username,password,emailid;
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
	public void setEmailid(String emailid)
	{
		this.emailid=emailid;
	}
	public String getEmailid()
	{
		return emailid;
	}
}