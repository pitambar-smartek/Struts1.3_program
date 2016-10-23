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
	public  ActionErrors validate(ActionMapping map,HttpServletRequest req)
	{
		ActionErrors ae=super.validate(map,req);
		
		if(username.length()==0)
			ae.add("username1",new ActionMessage("login.user1"));
		
		return ae;
		
	}

}