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
import java.util.List;
import java.util.StringTokenizer;
public class AccountAction extends Action
{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)
	{
		ActionForward af=null;
		AccountForm aff=(AccountForm)form;
		String balrange=aff.getBalrange();

                                float lower=0.0f,upper=0.0f;

                                StringTokenizer st=new StringTokenizer(balrange,"-");
                                
                                 while(st.hasMoreTokens())
                                   {
                                      lower=Float.parseFloat(st.nextToken());
                                      upper=Float.parseFloat(st.nextToken());
                                    }
		AccountModel am=new  AccountModel();

		List<Account> accounts=am.getAccounts(lower,upper);

			if(accounts!=null)
		{
			req.setAttribute("accounts",accounts);
			af=mapping.findForward("success");
		}
		else{
			af=mapping.findForward("failure");
		}
			return af;
          }

}