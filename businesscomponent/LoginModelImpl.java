package com.pitambar.service;

public class LoginModelImpl implements LoginModel
{
public boolean isAuthenticated(String user,String pwd)
{
boolean flag=false;  
if(user.equals(pwd))
flag=true;
return flag;
}
}