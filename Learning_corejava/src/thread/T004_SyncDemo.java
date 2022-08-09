package thread;

import java.util.Scanner;

class Account
{
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public boolean isExist(double amt)
	{
		boolean b = false;
		if(amt>balance)
		{
			b = false;
		}
		else
		{
			b = true;
		}
	
		return b;
	}
	
	public void widrow(double amt,String name)
	{
		balance = balance-amt;
		System.out.println("amount widrow by : "+name+" and current bal is : "+balance);
	}
}

class Customer implements Runnable
{

	String name;
	Account account;
	public Customer(String name, Account account) {
		this.name = name;
		this.account=account;
	}

	@Override
	public void run() {
		
		synchronized (account) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amont : "+name);
		double amt = sc.nextDouble();
		
		if(account.isExist(amt))
		{
			account.widrow(amt,name);
		}
		else
		{
			System.out.println("Insufficeint balance");
		}
		
		}
	}
	
}


public class T004_SyncDemo {
	public static void main(String[] args) {
		
		Account account = new Account(5000);
		
		Customer c1 = new Customer("Rahul",account);
		Customer c2 = new Customer("Mrugank",account);
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		
		t1.start();
		t2.start();
	}
}
