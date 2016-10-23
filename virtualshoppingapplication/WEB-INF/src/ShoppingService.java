package com.pitambar.service;
import java.util.Map;
import java.util.Collection;
public class ShoppingService
{
	public void addItem(Map m,Product p)
	{
		m.put(p.getPcode(),p);
	}
	public void removeItem(Map m,String pcode)
	{
		m.remove(pcode);
	}
	public Collection <Product> getAllItems(Map m)
	{
		Collection<Product> items=m.values();
		return items;
	}
}