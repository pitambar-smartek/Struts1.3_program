package com.pitambar.view;
import org.apache.struts.action.ActionForm;
public class RegForm extends ActionForm{
	private String name;
	private String password;
	private String emailid;
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return password;
	}
	public void setEmailid(String email){
		emailid = email;
	}
	public String getEmailid(){
		return emailid;
	}
}
