package p3;

public abstract class Employee
{
		String name;
		int salary;
		
		Employee()
		{
		//	System.out.println("Employee class constractor");
		}
		
		public void setSalary(int salary) {
			this.salary = salary;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		abstract public int getSalary();
		
}