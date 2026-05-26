package abstractclass;
abstract class Employee
{
	abstract void calculateSalary();
}
class FulltimeEmployee extends  Employee
{
	@Override
	void calculateSalary()
	{
		int perhour = 500;
		int noofhours = 8;
		int salary = perhour*noofhours;
		System.out.println("Calculated fulltime employee Salary=₹"+salary);
	}
}
public class PartTimeEmployee extends Employee
{
	@Override
	void calculateSalary() 
	{
		int perhour = 500;
		int noofhours = 4;
		int salary = perhour*noofhours;
		System.out.println("Calculated parttime employee Salary=₹"+salary);	
	}
public static void main(String[] args) 
{
	Employee e1 = new FulltimeEmployee ();
	e1.calculateSalary();
	Employee e2 = new PartTimeEmployee();
	e2.calculateSalary();
}
}
