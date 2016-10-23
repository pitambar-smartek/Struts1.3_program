package com.pitambar.controller;
import org.apache.struts.actions.*;
import javax.servlet.http.*;
import org.apache.struts.action.*;
import com.pitambar.service.EmpModel;
public class MyDispatchAction extends DispatchAction
{
	EmpModel em=new EmpModel();
	public ActionForward insert(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		String responseKey="failure";
		DynaActionForm daf=(DynaActionForm)form;
		int eno=(Integer)daf.get("empno");
		String name=(String)daf.get("name");
		float sal=(Float)daf.get("salary");
		boolean b=em.insert(eno,name,sal);
		if(b)
			responseKey="success";
		return mapping.findForward(responseKey);
	}
	public ActionForward delete(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		String responseKey="failure";
		DynaActionForm daf=(DynaActionForm)form;
		int eno=(Integer)daf.get("empno");
		boolean b=em.delete(eno);
		if(b)
			responseKey="success";
		return mapping.findForward(responseKey);
	}
	
}