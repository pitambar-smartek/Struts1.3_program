package com.pitambar.controler;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.pitambar.view.RegistrationForm;

public class Registration1Action extends Action
{
	
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)
	{
		RegistrationForm form1=(RegistrationForm)form;
		String agree=form1.getAgree();
		System.out.println(agree);
		if(agree.equals("false"))
			return mapping.findForward("notok");
		else			
		return mapping.findForward("success");
	}
}