package com.pitambar.controller;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.pitambar.service.RegModel;
import com.pitambar.service.RegAccount;
import com.pitambar.view.RegForm;
public class RegAction extends Action{
	RegModel lm = new RegModel();
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response){
		ActionForward forward = null;
		RegAccount la = new RegAccount();
		RegForm lf =(RegForm)form;
		la.setName(lf.getName());
		la.setPassword(lf.getPassword());
		la.setEmailid(lf.getEmailid());
		boolean flag = lm.isRegistered(la);
		if(flag)
			forward=mapping.findForward("okk");
		else
			forward=mapping.findForward("notokk");
		return forward;
	}
}