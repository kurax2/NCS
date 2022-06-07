package p3;

abstract class Employee
{
		String name;
		int salary;
		
		Employee()
		{
			System.out.println("Employee class constractor");
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

class Accountant extends Employee
{

	@Override
	public int getSalary() {
		
		return 200;
	}
	
}

class Developer extends Employee
{
	@Override
	public int getSalary()
	{
		return 300;
	}

}


public class AbstractClassDemo {
	public static void main(String[] args) {
		
		Accountant emp1 = new Accountant();
		System.out.println("Accountant Salary $"+emp1.getSalary());
		printEmployeeSalary(emp1);
		
		Developer emp2 = new Developer();
		System.out.println("Developer Salary $"+emp2.getSalary());
		printEmployeeSalary(emp2);
		
		/*
		 * Abstarct class cannot be initialized  new Employee();
		 * abstract class contains both abstract and non-abstract
		 * sub class have to override all the abstract methods
		 * 
		 * We can create Reference of Abstract class 
		 * ref of super class can have object of sub class
		 * */
		 // reference of abstract class is valid 
		//Employee e = new Employee();
		//System.out.println("Employee Salary $"+e.getSalary());
		
		Employee e1 = new Accountant();
		
		
		
	}
	public static void printEmployeeSalary(Employee e)
	{
		System.out.println("Employee Salary $"+e.getSalary());
	}
}













