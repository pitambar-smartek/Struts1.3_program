package com.pitambar.controller;
import org.apache.struts.actions.*;
import javax.servlet.http.*;
import javax.sql.*;
import java.util.*;
import org.apache.struts.action.*;
import com.pitambar.service.EmpModel;
public class MyLookupDispatchAction extends LookupDispatchAction
{
	EmpModel em=new EmpModel();
	public ActionForward insertEmp(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)
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
	public ActionForward deleteEmp(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)
	{
		String responseKey="failure";
		DynaActionForm daf=(DynaActionForm)form;
		int eno=(Integer)daf.get("empno");
		boolean b=em.delete(eno);
		if(b)
			responseKey="success";
		return mapping.findForward(responseKey);
	}
	public Map getKeyMethodMap()
	{
		Map m=new HashMap();
		m.put("insert","insertEmp");
		m.put("delete","deleteEmp");
		return m;
	}
}