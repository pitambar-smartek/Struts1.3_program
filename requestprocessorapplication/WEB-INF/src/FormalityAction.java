package com.pitambar.struts;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForward;
public class FormalityAction extends Action
{
	public ActionForward execute(ActionMapping am,ActionForm af,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		return am.findForward("success");
	}
}