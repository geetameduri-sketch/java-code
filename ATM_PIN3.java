package abstractclass;
abstract class Bank_6
{
	abstract void login(int enteredPin);
}
public class ATM_PIN3 extends Bank_6
{
      int pin =2007;
      int attempts=0;
      boolean isBlocked=false;
	  @Override
	  void login(int enteredPin) 
	  {
	    if(isBlocked)
		  {
			  System.out.println("Account blocked");
			  return;
		  }
		if(pin == enteredPin )
		{
			System.out.println("Login successful");
			attempts=0;
		}
		else
		{
			attempts++;
			System.out.println("invalid pin");
			if(attempts==3)
			{
				isBlocked = true;
				System.out.println("Account Blocked");
			}
			
		}
		
	  }
	  public static void main(String[] args) 
	  {
		  ATM_PIN3 a1 = new ATM_PIN3();
		  a1.login(1234);
		  a1.login(1111);
		  a1.login(2006);
		  a1.login(2007);
	}
}
