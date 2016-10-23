package com.pitambar.controler;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.Action;
import com.pitambar.model.LoginModel;
import com.pitambar.view.*;
import com.pitambar.exception.LoginFailedException;
import com.pitambar.exception.ProcessingException;
public class LoginAction extends Action
{
	LoginModel lm=new LoginModel();
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)
	{
		ActionForward forward=null;z
		String logicalname="success";
		LoginForm lf=(LoginForm)form;
		String user=lf.getUsername();
		String password=lf.getPassword();
        try{

		lm.isAutenticated(user,password);		
		}catch(LoginFailedException e)
		{
			logicalname="failure";
		}catch(ProcessingException e)
		{
			logicalname="abnormal";
		}
           forward=mapping.findForward(logicalname);
			return forward;
	}
}