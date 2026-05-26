package abstractclass;
abstract class Bank_1
{
	int balance =50000;
	abstract void deposit(int amount);
	abstract void withdraw(int amount);
}
public class ATM extends Bank_1
{
	void deposit( int amount) 
	{
		balance=balance+amount;
		System.out.println("The deposit amount is:" + balance);
	}
	void withdraw(int amount)
	{
		if(balance>=amount)
		{   
			System.out.println("Withdraw amount is:" + amount);
			balance = balance-amount;
			System.out.println("After withdraw amount:"+ balance);
	    }
		else
		{
			System.out.println("insufficient balance");
		}
	}
public static void main(String[] args) 
{
	ATM a1 = new ATM();
	a1.deposit(5000);
	a1.withdraw(10000);
}
}
