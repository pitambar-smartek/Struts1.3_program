package com.pitambar.service;
public class AccountDTO implements java.io.Serializable{
	private int accno;
	private String name;
	private float balance;
	public void setAccno(int ano){
		accno = ano;
	}
	public int getAccno(){
		return accno;
	}
	public void setName(String nm){
		name = nm;
	}
	public String getName(){
		return name;
	}
	public void setBalance(float bal){
		balance = bal;
	}
	public float getBalance(){
		return balance;
	}
}