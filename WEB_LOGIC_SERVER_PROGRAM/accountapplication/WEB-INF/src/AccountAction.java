package com.pitambar.controller;
import org.apache.struts.action.*;
import com.pitambar.view.AccountForm;
import com.pitambar.service.AccountDTO;
import com.pitambar.service.AccountModel;
import javax.servlet.http.*;
public class AccountAction extends Action{
	AccountModel am = new AccountModel();
	private static final String SUCCESS = "success";
    private static final String FAILER = "failer";
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response){
		AccountForm af = (AccountForm)form;
		ActionForward forward = null;
		int ano = af.getAccno();
		AccountDTO acc = am.getAccount(ano);
		
        if(acc!=null){
			request.setAttribute("account",acc);
			forward = mapping.findForward(SUCCESS);
		}
		else
			forward = mapping.findForward(FAILER);
		return forward;
	}
}