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
import com.pitambar.exception.AccountNotFoundException;
import com.pitambar.exception.ProcessingException;
public class AccountAction extends Action
{
	public static final String SUCCESS="success";
		public static final String FAILURE="failure";
		public static final String ABNORMAL="abnormal";
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)
	{
	//	ActionForward af=null;
	
		 String logicalname=SUCCESS;
		AccountForm aff=(AccountForm)form;
		int ac=aff.getAccno();
		AccountModel am=new  AccountModel();
		try{
		Account account =am.getAccount(ac);
		req.setAttribute("account",account);
		}catch(AccountNotFoundException e)
		{
			logicalname=FAILURE;
		}
		catch(ProcessingException e)
		{
			logicalname=ABNORMAL;
		}
	
			return mapping.findForward(logicalname);
          }

}