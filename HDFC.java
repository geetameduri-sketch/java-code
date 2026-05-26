package abstractclass;
abstract class Bank
{
	abstract double getinterestrate();
}
class SBI extends Bank
{
	@Override
	double getinterestrate() //instance variable
	{
		return 8.5;
	}
}
public class HDFC extends Bank
{

	@Override
	double getinterestrate()
	{
		return 7.5;
	}
public static void main(String[] args) 
{
	Bank S =  new SBI();
	System.out.println("SBI interest rate:"  +S.getinterestrate()+"%");
	Bank H = new HDFC();
	System.out.println("HDFC interest rate:"  +H.getinterestrate()+"%");
	
}
}
