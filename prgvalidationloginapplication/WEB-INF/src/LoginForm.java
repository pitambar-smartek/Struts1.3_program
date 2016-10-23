package com.pitambar.view;
import org.apache.struts.validator.ValidatorForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMessage;
import javax.servlet.http.HttpServletRequest;
public class LoginForm extends ValidatorForm
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
	public ActionErrors validate(ActionMapping mapping,HttpServletRequest req)
	{
		ActionErrors ar=new ActionErrors();
		if(username.length()==0)
			ar.add("username",new ActionMessage("user.required"));
		if(password.length()==0)
			ar.add("password",new ActionMessage("pwd.required"));

		return ar;
	}

}