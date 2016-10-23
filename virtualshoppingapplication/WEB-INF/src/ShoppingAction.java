package com.pitambar.controler;
import org.apache.struts.action.*;
import javax.servlet.http.*;
import java.util.*;
import com.pitambar.service.Product;
import com.pitambar.service.ShoppingService;
import com.pitambar.view.ShoppingForm;
public class ShoppingAction extends Action
{
	ShoppingService ss =new ShoppingService();
	public ActionForward execute(ActionMapping map,ActionForm form,HttpServletRequest req,HttpServletResponse res)
	{
		String responsepage="shoppingpage";
		ShoppingForm sf=(ShoppingForm)form;
		String sb=sf.getSubmit();
		HttpSession session=req.getSession();
		Map cart=(Map)session.getAttribute("cart");
		if(cart==null)
		{
			cart=new HashMap();
			session.setAttribute("cart",cart);
		}
		if(sb.equals("ADDITEM"))
		{
			Product p=new Product();
			p.setPcode(sf.getPcode());
			p.setQuantity(sf.getQuantity());
			ss.addItem(cart,p);

		}
		else if(sb.equals("REMOVEITEM"))
		{
			ss.removeItem(cart,sf.getPcode());
		}
		else if(sb.equals("SHOWITEMS"))
		{
			Collection<Product> products=ss.getAllItems(cart);
			if(products.size()==0)
			{
				responsepage="noitems";
			}
			else{
				session.invalidate();
				responsepage="farewel";
			}
		}
		return map.findForward(responsepage);
		
	}
}