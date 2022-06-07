package p3;

public class Accountant extends Employee
{

	@Override
	public int getSalary() {
		
		return 200;
	}
	
	public void doSalaryThings()
	{
		
		// accountant credited the salary
		System.out.println("Accountant Credited the Salary");
	}
	
}