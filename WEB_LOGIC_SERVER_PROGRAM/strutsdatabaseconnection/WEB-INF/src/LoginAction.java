package com.pitambar.controller;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.pitambar.service.LoginModel;
import com.pitambar.view.LoginForm;
public class LoginAction extends Action{
	LoginModel lm = new LoginModel();
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response){
		ActionForward forward = null;
		LoginForm lf =(LoginForm)form;
		String user = lf.getUsername();
		String pwd = lf.getPassword();
		boolean flag = lm.isAuthenticated(user,pwd);
		if(flag)
			forward=mapping.findForward("ok");
		else
			forward=mapping.findForward("notok");
		return forward;
	}
}