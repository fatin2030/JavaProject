package classes;

import java.lang.*;
import interfaces.AccountOperations;

public abstract class Account implements AccountOperations
{	
	private int accountId;
    private String accountOwnerName;
	private double bill;

	public Account()
	{
		System.out.println("Empty-Account");
	}
	public Account(int accountId, String accountOwnerName, double bill)
	{
		System.out.println("Parameterized-Account");
		this.accountId = accountId;
		this.accountOwnerName = accountOwnerName;
		this.bill = bill;
	}
		
	public void setAccountId(int accountId){ this.accountId = accountId; }
	public void setAccountOwnerName(String accountOwnerName){	this.accountOwnerName = accountOwnerName;	}
	public void setBill(double bill){	this.bill = bill; }
	
	public int getAccountId(){	return accountId; }
	public String getAccountOwnerName(){	return accountOwnerName; }
	public double getBill(){ return bill;	}
	
	public abstract void showDetails();
	
	public boolean deposit(double amount)
	{
		boolean flag = false;
		if(amount>0)
		{
			bill = bill + amount;
			flag = true;
		}
		return flag;
	}
	public boolean withdraw(double amount)
	{
		boolean flag = false;
		if(amount>0 && amount<=bill)
		{
			bill = bill - amount;
			flag = true;
		}
		return flag;
	}
}