package com.pitambar.view;
import org.apache.struts.action.*;
import org.apache.struts.upload.FormFile;
public class StrutsUploadAndSaveForm extends ActionForm
{
  private FormFile theFile;

    public FormFile getTheFile() {
       return theFile;
  }
  public void setTheFile(FormFile theFile) {
       this.theFile = theFile;
  }
} 
