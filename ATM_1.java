package abstractclass;
abstract class Bank_2
{
	int balance = 50000;
	abstract void deposit(int amount);
	abstract void withdraw(int amount);
	abstract void checkBalance();
}
public class ATM_1 extends Bank_2
{
	void deposit(int amount) 
	{
		balance= balance+amount;
	    System.out.println("The deposit balance is:"+ balance);
	}
	void withdraw(int amount) 
	{
		if(balance>=amount)
		{
			balance=balance-amount;
			System.out.println("Withdraw balance is:"+balance);
		}
		else
		{
			System.out.println("insufficient balance");
		}
	
	}
	void checkBalance() 
	{
		System.out.println("current balance is:" + balance);
	}
	public static void main(String[] args)
	{
		ATM_1 a1= new ATM_1();
		a1.deposit(15000);
		a1.withdraw(250000);
		a1.checkBalance();
	}

}
