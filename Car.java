package abstractclass;
abstract class Vehicle
{
	abstract void run();
	Vehicle ()
	{
		System.out.println("Vehicle created");
	}
}
public class Car extends Vehicle
{
  public static void main(String[] args)
  {	
	  Car c= new Car();
	  c.run();
	 
}
  @Override
  void run() 
  {
	System.out.println("Vehicle");
	
  }
}
