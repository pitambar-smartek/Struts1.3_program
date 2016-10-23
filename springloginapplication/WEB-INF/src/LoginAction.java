package com.pitambar.controler;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.Action;
import com.pitambar.service.LoginModel;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import com.pitambar.view.*;
public class LoginAction extends Action
{
	LoginModel lm;
	public LoginAction()
	{
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
                                lm=(LoginModel)factory.getBean("lm");
	}
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)
	{
		ActionForward forward=null;
		LoginForm lf=(LoginForm)form;
		String user=lf.getUsername();
		String password=lf.getPassword();

		boolean flag=lm.isAuthenticated(user,password);
		if(flag)
			forward=mapping.findForward("success");
		else
			forward=mapping.findForward("failure");
		return forward;
	}
}