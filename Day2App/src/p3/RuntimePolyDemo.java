package p3;

abstract class A
{
	int x = 10;
	abstract public void doAThings() ;
}

class B extends A
{
		@Override
		public void doAThings() {
			x = x +2;
			System.out.println(" doAThings in class B "+x); // 12
		}
		public void doBThings()
		{
			x = x+2;
			System.out.println("doBThings "+x); // 14
		}
}

class C extends A
{
		@Override
		public void doAThings() {
			x = x -2;
			System.out.println(" doAThings in class C "+x); // 12
		}
		public void doCThings()
		{
			x = x-2;
			System.out.println("doCThings "+x); // 14
		}
}

public class RuntimePolyDemo {

	public static void main(String[] args) {
	// compile   runtime	
		A a = new B();
		a.doAThings();
		a = new C();
		
		if(a instanceof B)
		{
			B bObj = (B)a;
			//B bObj = new B();
			bObj.doBThings();
		}
		
	// ------------------------
		
	
	
	}
}
