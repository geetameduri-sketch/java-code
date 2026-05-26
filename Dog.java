package abstractclass;

abstract class Animal
{
	abstract void sound();
	void sleep()
	{
		System.out.println("Animal sound");
	}
}
public class Dog extends Animal
{

	void sound() 
	{
		System.out.println("Dog sound barks");
		
	}
public static void main(String[] args) 
{
	 Dog d=new  Dog();
	 d.sound();
	 d.sleep();
}
}
