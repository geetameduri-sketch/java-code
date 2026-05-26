package abstractclass;
abstract class Bank_3
{
	abstract void login(int enteredPin);
}
public class ATM_PIN extends Bank_3
{
    int pin=1234;
    boolean isloggedIn=false;
	@Override
	void login(int enteredPin) 
	{
		if(pin == enteredPin)
		{
			System.out.println("login successful");
			isloggedIn=true;
		}
		else
		{
			System.out.println("Invalid login");
		}
	}
public static void main(String[] args) 
{
	ATM_PIN a1 = new ATM_PIN();
	a1.login(2007);
}

}
