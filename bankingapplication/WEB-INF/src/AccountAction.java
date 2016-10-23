package com.pitambar.controler;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.pitambar.dao.Account;
import com.pitambar.model.OpeningUseCase;
import com.pitambar.exception.ProcessingException;
import com.pitambar.dao.Account;
import com.pitambar.view.OpenAccountForm;
public class AccountAction extends Action
{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)
	{
		ActionForward af=null;
		OpenAccountForm aff=(OpenAccountForm)form;
		int ac=aff.getAccno();
                                String name=aff.getName();
                                 float balance=aff.getBalance();
								 Account acc=new Account();
								 acc.setAccno(ac);
								 acc.setName(name);
								 acc.setBalance(balance);
		OpeningUseCase am=new  OpeningUseCase();
		try{
		am.openingAccount(acc);
			return mapping.findForward("ok");
		}catch(ProcessingException e){
		return mapping.findForward("notok");
		}	
	}
}