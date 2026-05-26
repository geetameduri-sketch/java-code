package abstractclass;
abstract class Employee1
{
	abstract void calculateSalary1(int perhour, int noofhours);
}
class FullTimeEmployee1 extends Employee1
{
	@Override
	void calculateSalary1(int perhour, int noofhours)
	{
		int Salary=perhour*noofhours;
		System.out.println("Calculated FullTimeEmployee1 Salary:₹" +Salary );
	}
}
public class PartTimeEmployee1 extends Employee1
{
	@Override
	void calculateSalary1(int perhour, int noofhours) 
	{
		int Salary=perhour*noofhours;
		System.out.println("Calculated PartTimeEmployee1 Salary:₹" +Salary );
	}
public static void main(String[] args) 
{
	Employee1 e= new FullTimeEmployee1();
	e.calculateSalary1(2000, 8);
	Employee1 e1= new PartTimeEmployee1();
	e1.calculateSalary1(2000, 4);
}
}
