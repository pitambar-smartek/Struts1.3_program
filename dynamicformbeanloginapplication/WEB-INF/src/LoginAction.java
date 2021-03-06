package com.pitambar.controler;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.Action;
import com.pitambar.model.LoginModel;
import org.apache.struts.action.DynaActionForm;
public class LoginAction extends Action
{
	LoginModel lm=new LoginModel();
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)
	{
		ActionForward forward=null;
		DynaActionForm lf=(DynaActionForm)form;
		String user=(String)lf.get("username");
		String password=(String)lf.get("password");

		boolean flag=lm.isAutenticated(user,password);
		if(flag)
			forward=mapping.findForward("success");
		else
			forward=mapping.findForward("failure");
		return forward;
	}
}