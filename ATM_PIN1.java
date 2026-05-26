package abstractclass;
abstract class Bank_4
{
	abstract void login(int enteredPin);
}
public class ATM_PIN1 extends Bank_4
{
     int pin =1234;
     int attempts =0;
     boolean isBlocked = false;
	
	 void login(int enteredPin)
	 {
		 if(isBlocked)
		 {
			 System.out.println("Account Blocked");
			 return;
		 }
		if(pin ==enteredPin)
		{
			System.out.println("login successful");
			attempts = 0;
		}
		
		else
		{
			attempts++;
			System.out.println("Invalid PIN");
			if(attempts == 3)
			{
				isBlocked=true;
				System.out.println("Account Blocked");
			}
		}
	 }
	 public static void main(String[] args) 
	 {
		 ATM_PIN1 a1 = new ATM_PIN1();
		 a1.login(1111);
		 a1.login(1255);
		 a1.login(1235);
		 a1.login(1234);
		 
	}
}
