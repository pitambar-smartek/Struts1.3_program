package com.pitambar.controler;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.pitambar.model.RegistrationService;
import com.pitambar.view.RegistrationForm;
import com.pitambar.dto.Register;
import org.apache.commons.beanutils.BeanUtils;
public class RegistrationAction extends Action
{
	RegistrationService rs=new RegistrationService();
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		ActionForward af;
		RegistrationForm rf=(RegistrationForm)form;
		/*String user=rf.getUsername();
		String pwd=rf.getPassword();
		String email=rf.getEmailid();*/

        Register r=new Register();

	/*	r.setUsername(user);
		r.setPassword(pwd);
		r.setEmailid(email);*/

//For that above six line one line is sufficient i.e bellow

 org.apache.commons.beanutils.BeanUtils.copyProperties(r,rf);

boolean flag =rs.registerUser(r);
		if(flag)
			af=mapping.findForward("ok");
		else
			af=mapping.findForward("notok");

        return af;
	}
}