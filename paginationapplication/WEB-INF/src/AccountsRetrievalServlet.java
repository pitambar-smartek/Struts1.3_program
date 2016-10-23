import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.pitambar.dao.AccountDAO;
import com.pitambar.dao.Account;
import java.util.List;
public class AccountsRetrievalServlet extends HttpServlet
{
	AccountDAO dao=new AccountDAO();
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		int pageNumber=1;
		if(req.getParameter("page")!=null)
		{
			getServletContext().setAttribute("page",req.getParameter("page"));
			pageNumber=Integer.parseInt(req.getParameter("page"));
		}
		else{
			getServletContext().setAttribute("page","1");
		}
		String nextPage =(pageNumber+1)+"";
		List<Account> accounts=dao.getAccounts(pageNumber);
		getServletContext().setAttribute("accounts",accounts);
		String myUrl="./accservlet?page="+nextPage;
		req.setAttribute("myUrl",myUrl);
		req.setAttribute("n",accounts.size());
		req.getRequestDispatcher("results.jsp").forward(req,res);
	
}
}