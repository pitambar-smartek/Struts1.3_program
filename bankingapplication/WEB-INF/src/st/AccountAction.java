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
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)
	{
		ActionForward af=null;
		AccountForm aff=(AccountForm)form;
		int ac=aff.getAccno();
                                String name=aff.getName();
                                 float balance=aff.getBalance();
		OpeningUseCase am=new  OpeningUseCase();
		Account account =am.getAccount(ac);
			if(account!=null)
		{
			req.setAttribute("account",account);
			af=mapping.findForward("success");
		}
		else{
			af=mapping.findForward("failure");
		}
			return af;
          }

}