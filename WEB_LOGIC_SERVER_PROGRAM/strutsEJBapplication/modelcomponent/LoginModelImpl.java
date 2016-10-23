package com.pitambar.service;
import javax.ejb.Stateless;
import javax.ejb.Remote;
@Stateless(mappedName="addition")
@Remote
public class LoginModelImpl implements LoginModel{
	public boolean isAuthenticated(String user,String pwd){
		boolean flag = false;
		if(user.equals(pwd))
			flag = true;
		return flag;
	}
}