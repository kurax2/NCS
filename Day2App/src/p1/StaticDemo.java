package p1;

public class StaticDemo {
	
	int x = 10; // non static 
	
	
	static {  // static block, which loads during class loading time , before main
		System.out.println(" 1. code inside static block");
		// database connection
		// file storage 
		// base api address
		// common port numbers
		// commoon server conf things
	}
	
	
	
	StaticDemo()  // constructor , calls when object is created
	{
		System.out.println("4.  Object created ");
	}
	public static void doThings()   // business operation , which is common for class
	{
		System.out.println("3. Inside doTings");
	}
	
	public void someWork() // business operation
	{
		System.out.println("Non static - somework method() ");
	}
	
	public static void main(String[] args) {
		System.out.println("2. Code inside main");
		doThings();
		
		new StaticDemo().someWork(); // error , non static data is not accessible in static block 
		new StaticDemo().x++; // based on above reason 
	}

}
