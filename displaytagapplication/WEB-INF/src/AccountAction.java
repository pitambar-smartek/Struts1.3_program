package com.pitambar.struts;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForward;

public class AccountAction extends Action
{
	AccountService as=new AccountService();
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		req.setAttribute("accounts",as.getAccounts());
		return mapping.findForward("success");
	}
}