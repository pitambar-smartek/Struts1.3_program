package com.pitambar.service;
import com.pitambar.dto.Registration;
public class RegisterService
{
	public boolean doRegistration(Registration regist)
	{
		boolean flag=false;
		if(regist.getName()!=null&&regist.getPassword()!=null&&regist.getProfession()!=null&&regist.getGender()!=null&&regist.getAgree()!=null&&regist.getCell()!=null)
		     flag=false;
		return flag;
	}
}