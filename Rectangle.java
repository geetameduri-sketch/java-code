package abstractclass;
abstract class Shape
{
	abstract void draw();
}
class Circle extends  Shape
{
	void draw1() 
	{
		System.out.println("Circle having Radius");
	}
	void draw() 
	{
	   System.out.println("Area of circle");
	}
}
public class Rectangle extends Shape
{
	static void draw2()
	{
		System.out.println("Rectangle having length and width");
	}
	void draw()
	{
		System.out.println("Area of  Rectangle");
		
	}
public static void main(String[] args)
	{
	
	Rectangle r=new Rectangle();
	r.draw();
	draw2();
	Circle c= new Circle();
	c.draw();
	c.draw1();	
}
	
}
	
	


