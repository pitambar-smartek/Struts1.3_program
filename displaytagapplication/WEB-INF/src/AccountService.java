package com.pitambar.struts;
import java.util.List;
import java.util.ArrayList;
public class AccountService
{
	public List<Account> getAccounts()
	{
		List<Account> accounts=new ArrayList<Account>();
		accounts.add(new Account(1001,"ABC",8400));
		accounts.add(new Account(1002,"BCD",9500));
		accounts.add(new Account(1003,"CDE",7800));
		accounts.add(new Account(1004,"FGH",24000));
		accounts.add(new Account(1005,"IJK",18800));
		accounts.add(new Account(1006,"LMN",3500));
		accounts.add(new Account(1007,"OPQ",10000));
		accounts.add(new Account(1008,"RST",9500));
		accounts.add(new Account(1009,"UVW",4780));
		accounts.add(new Account(1010,"XYZ",4920));
		accounts.add(new Account(1011,"PITA",5100));
		accounts.add(new Account(1012,"MANAS",4500));
		accounts.add(new Account(1013,"MADAN",7700));
		accounts.add(new Account(1014,"JAGA",8900));
		return accounts;
	}
}