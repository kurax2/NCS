package p4;

/*
 * 1) interface are not the sub type of Object
 * 2) interface do not constructor
 * 3) Cannnot instantiate the interface  x obj = new X(); // same like abstract class
 * 4) ref of Interface is possible  // x ref;
 * 5) class imlements as interface
 * 6) class have to implements/override all the methods of an interface
 * 7) one interface extends another interface
 * */
interface X{
	public void doThis();
	public void doThis2();
	public void doThis3();
	
	
}
interface y extends X
{
	public void doYWork();
	
}

class MyWork implements X, y
{

	@Override
	public void doThis() {
		
		
	}

	@Override
	public void doThis2() {
		
		
	}

	@Override
	public void doThis3() {
		
		
	}

	@Override
	public void doYWork() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}


public class InterfaceDemo {
	
	public static void main(String[] args) {
		X obj = new MyWork();
		obj.doThis();
		obj.doThis2();
		obj.doThis3();
		
		MyWork abc = (MyWork)obj;
		abc.doYWork();
		
	}

}
