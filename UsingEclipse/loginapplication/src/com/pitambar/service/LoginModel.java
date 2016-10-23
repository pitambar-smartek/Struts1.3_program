package com.pitambar.service;


	public class LoginModel
	{
		public boolean isAutenticated(String user,String pwd)
		{
			boolean flag=false;
			if(user.equals(pwd))
				flag=true;
			return flag;
		}
	}


