package p3;

public class Developer extends Employee
{
	@Override
	public int getSalary()
	{
		return 300;
	}

	public void submitProject()
	{
		System.out.println("Developer project submission");
	}
}