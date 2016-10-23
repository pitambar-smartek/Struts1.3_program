package com.pitambar.controler;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.pitambar.model.RegistrationService;
//import com.pitambar.view.RegistrationForm;
import org.apache.commons.beanutils.DynaBean;
public class RegistrationAction extends Action
{
	RegistrationService rs=new RegistrationService();
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		ActionForward af;
		DynaBean rf=(DynaBean)form;
		String user=(String)rf.get("username");
		String pwd=(String)rf.get("password");
		String email=(String)rf.get("emailid");
		
		boolean flag =rs.registerUser(user,pwd,email);
		if(flag)
			af=mapping.findForward("ok");
		else
			af=mapping.findForward("notok");

        return af;
	}
}