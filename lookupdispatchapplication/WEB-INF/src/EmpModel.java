package com.pitambar.service;
public class EmpModel
{
	public boolean insert(int empno,String name,float sal)
	{
		if(empno<1010)
			return true;
		else
			return false;
	}
	public boolean delete(int empno)
	{
		if(empno<1010)
			return true;
		else
			return false;
	}
}