package com.pitambar.view;
import org.apache.struts.action.ActionForm;
public class RegisterForm extends ActionForm
{
	private String name;
	private String profession;
	private String gender;
	private String password;
	private String agree;
	private String cell;
	public void setName(String name)
	{
		this.name=name;

	}
	public String getName()
	{
		return name;
	}
	public void setProfession(String profession)
	{
		this.profession=profession;
	}
	public String getProfession()
	{
		return profession;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getPassword()
	{
		return password;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public String getGender()
	{
		return gender;
	}
	public void setAgree(String agree)
	{
		this.agree=agree;
	}
	public String getAgree()
	{
		return agree;
	}
	public void setCell(String cell)
	{
		this.cell=cell;
	}
	public String getCell()
	{
		return cell;
	}
		
}