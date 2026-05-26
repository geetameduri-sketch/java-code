package abstractclass;
abstract class Mobile
{
	abstract void camera();
	void calling()
	{
		System.out.println("Calling feature availability");
	}
}
class Samsung extends Mobile
{
	@Override
	void camera()
	{
		System.out.println("Samsung camera is good");
	}
}
public class Apple extends Mobile
{
	@Override
	void camera() 
	{
		System.out.println("Apple camera is good");	
	}
 public static void main(String[] args)
 {
	 Samsung s = new Samsung();
	 s.camera();
	 s.calling();
	 Apple a= new Apple();
	 a.camera();
	 
	 
}
}
