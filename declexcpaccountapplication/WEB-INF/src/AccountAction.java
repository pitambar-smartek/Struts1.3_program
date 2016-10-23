package com.pitambar.controler;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.pitambar.dto.Account;
import com.pitambar.view.AccountForm;
import com.pitambar.model.AccountModel;
public class AccountAction extends Action
{
	AccountModel am=new  AccountModel();
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	{		
		AccountForm aff=(AccountForm)form;
		int ac=aff.getAccno();
		Account account =am.getAccount(ac);
		req.setAttribute("account",account);
			
			return mapping.findForward("success");
          }

}