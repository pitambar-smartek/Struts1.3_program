package com.pitambar.controler;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionForm;
import javax.servlet.http.*;
import com.pitambar.service.RegisterService;
import com.pitambar.view.RegisterForm;
import com.pitambar.dto.Registration;
import org.apache.commons.beanutils.*;
public class Register2Action extends Action
{
		RegisterService rs=new RegisterService();
		private static final String SUCCESS="success";
		private static final String FAILURE="failure";
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	  {
		RegisterForm form1=(RegisterForm)form;
		String responseKey=FAILURE;
		Registration reg=new Registration();
		BeanUtils.copyProperties(reg,form1);
		boolean flag=rs.doRegistration(reg);
		if(flag)
			     responseKey=SUCCESS;
		return mapping.findForward(responseKey);
	  }
}