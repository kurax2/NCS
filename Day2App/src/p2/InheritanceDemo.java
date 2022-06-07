package p2;
class A{

	public A() {
		System.out.println("A Constrcutor");
	}
	
}

class B extends A  // class B is 3rd party 
{
	B(int x)
	{
		super(); // it must be the first statement
		System.out.println("B Constrcutor");
	}
}
class E{}

class C extends B 
{
	C(int myValue)
	{
		super(myValue);
		System.out.println("C constructor");
	}
}
class D extends B
{

	public D(int x) {
		super(x);
		
	}
	
}


public class InheritanceDemo {

	public static void main(String[] args) {
		C obj = new C(100);
		D obj1 = new D(34);
	}
}





















