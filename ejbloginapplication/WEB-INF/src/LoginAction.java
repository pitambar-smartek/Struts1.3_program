package com.pitambar.controler;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.Action;
import com.pitambar.service.LoginModel;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import com.pitambar.view.*;
public class LoginAction extends Action
{
	LoginModel lm;
	public LoginAction()
	{
		try{
			InitialContext ic=new InitialContext();
			lm=(LoginModel)ic.lookup("authenticate#com.pitambar.service.LoginModel");
		}catch(NamingException e)
		{
			System.out.println(e);
		}
	}
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)
	{
		ActionForward forward=null;
		LoginForm lf=(LoginForm)form;
		String user=lf.getUsername();
		String password=lf.getPassword();

		boolean flag=lm.isAuthenticated(user,password);
		if(flag)
			forward=mapping.findForward("success");
		else
			forward=mapping.findForward("failure");
		return forward;
	}
}