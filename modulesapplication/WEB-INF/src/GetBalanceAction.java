package com.pitambar.user.action;
import javax.servlet.http.*;
import org.apache.struts.action.*;
public class GetBalanceAction extends Action
{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)
	{
		return mapping.findForward("success");
	}
}