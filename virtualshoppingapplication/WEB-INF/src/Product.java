package com.pitambar.service;
public class Product implements java.io.Serializable
{
	private String pcode;
	private int quantity;
	public void setPcode(String pcode)
	{
		this.pcode=pcode;
	}
	public String getPcode()
	{
		return pcode;
	}
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	public int getQuantity()
	{
		return quantity;
	}
}