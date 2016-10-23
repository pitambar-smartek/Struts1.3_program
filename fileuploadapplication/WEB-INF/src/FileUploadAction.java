package com.pitambar.controller;
import java.io.FileOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;
import com.pitambar.view.FileUploadForm;

public class FileUploadAction extends Action
{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)
	{
		FileUploadForm fileUploadForm=(FileUploadForm)form;
		try{
			FormFile formfile=fileUploadForm.getFile();
			String path=getServlet().getServletContext().getRealPath("")+"/"+formfile.getFileName();

			FileOutputStream fos=new FileOutputStream(path);
			fos.write(formfile.getFileData());
			fos.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return mapping.findForward("success");
	}
}