package exception;

class Bank
{
	double balance;
	
	public void getBalance()
	{
		System.out.println("Current balance is : "+balance);
	}
	
	public void diposite(double amt)
	{
		balance = balance+amt;
	}
	
	public void widrow(double amt) throws MyOwnException
	{
		if(amt>balance)
		{
			throw new MyOwnException();
		}
		else
		{
			balance = balance-amt;
		}
	}
}

public class E03_CustomeException {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.getBalance();
		bank.diposite(5000);
		
		bank.getBalance();
		
		try {
			bank.widrow(7000);
		} catch (MyOwnException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.msg();
		}
		
		bank.getBalance();
	}
}
