package p3;
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


public class AbstractClassDemo {
	public static void main(String[] args) {
		
		Accountant emp1 = new Accountant();
		printEmployeeSalary(emp1);
		
		Developer emp2 = new Developer();
		printEmployeeSalary(emp2);
		
		
		Employee e1 = new Accountant();
		
		
		
	}
	public static void printEmployeeSalary(Employee e)
	{
		System.out.println("Employee Salary $"+e.getSalary()); // common method 
		                                                   // from super
		
		if(e instanceof Accountant)
		{
			 // call to specific method of sub type
			Accountant acc  = (Accountant)e;
			acc.doSalaryThings();
		}
		if(e instanceof Developer)
		{
			Developer d = (Developer)e;
			d.submitProject();
		}
		
	}
}













