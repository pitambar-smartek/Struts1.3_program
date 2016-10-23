package com.pitambar.controller;
import org.apache.struts.action.*;
import com.pitambar.view.AccountForm;
import com.pitambar.service.AccountDTO;
import com.pitambar.service.AccountModel;
import javax.servlet.http.*;
import java.util.*;
public class AccountAction extends Action{
	AccountModel am = new AccountModel();
	private static final String SUCCESS = "success";
    private static final String FAILER = "failer";
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response){
		AccountForm af = (AccountForm)form;
		ActionForward forward = null;
		float lower = 0.0f;
		float upper = 0.0f;
		String bal = af.getBalance();
		StringTokenizer st = new StringTokenizer(bal,"-");
		while(st.hasMoreTokens()){
           lower = Float.parseFloat(st.nextToken());
		   upper = Float.parseFloat(st.nextToken());
		}
		List<AccountDTO> acc = am.getAccount(lower,upper);
        if(acc!=null){
			request.setAttribute("accounts",acc);
			forward = mapping.findForward(SUCCESS);
		}
		else
			forward = mapping.findForward(FAILER);
		return forward;
	}
}