package com.pitambar.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;


public class RegisterAction extends DispatchAction
{
	public ActionForward registerPage(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		saveToken(req);//save token before showing register.jsp
		return mapping.findForward("register");
	}
		public ActionForward register(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
			String responseKey="success";
			if(this.isTokenValid(req))
		{
				resetToken(req);
				//write the code to perform the registration
		}
		else
		{
			responseKey="warning";
		}
		return mapping.findForward(responseKey);
	}
}