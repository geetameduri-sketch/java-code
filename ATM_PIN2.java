package abstractclass;
abstract class Bank5
{
	abstract void loign(int enteredPin);
}
public class ATM_PIN2 extends Bank5
{
      int pin = 2007;
      boolean isloggedIn = false;
	  @Override
	  void loign(int enteredPin)
	  {
		if(pin == enteredPin)
		{
			System.out.println("Successful login");
			isloggedIn = true;
			System.out.println("Welcome to ATM");
		}
		else
		{
			System.out.println("invalid pin");
		}
		
	  }
	  public static void main(String[] args) 
	  {
		  ATM_PIN2 a1 = new ATM_PIN2();
		  a1.loign(2005);
		  
	}
}
