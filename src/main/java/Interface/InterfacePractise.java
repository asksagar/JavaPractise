package Interface;

public class InterfacePractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//C c1 = new C( );
		// 12.  Cannot instantiate the type C
		
		D d1 = new D( );
		//d1.foo1( );
		// 13.  The method foo1() from the type C is not visible/ nor accessible as it is private method in class C.
		
		C c2;
		c2 = new D( );
		// 14.  There is no error in this code sequence as c2 is reference of abstract class but refer to the object/instantiate of class D.
	}

	public class E extends D
	{
		public void foo4( )
		{
		//	super.foo4( );	// // 15.  The method foo4() from the type D is not visible/ nor accessible as it is private method in class C.
			System.out.println( "Hello E foo4()" );
		}
	}
	
	/*
	public class J extends I    // 16. I is interface and needs to be implements instead of extends
	{
	}
	*/
	
	public class K
	{
	//public void foo( ); // 17. This method requires a body instead of a semicolon. Method Need to be implemented as it is not abstract method.
	}
	
	public abstract class M {
		private int n;
		protected double p;
		public abstract void foo1();
		}
	
	public class P extends M
	{
		// 18.  class P must implement the inherited abstract method M.foo1() like below
		
		public void foo1(){
			//System.out.println("n is: " + n);   
			// 19. M.n is private and not accessible need to be change to Protected or Public
		}
		
		public P(double newP) {
		//	p = newP;
		}
	}
		
	public class Q extends P {
		private int z;
		public Q(double newP, int z) {
		/*	this.z = z;
			super(newP); // line 7
		*/
			// 20. Constructor call (super(newP)) must be the first statement in a sub class constructor. like below:
			super(newP); // line 6
			this.z = z;
			
		// We need to call the super class constructor explicitly in sub class constructor if it is parameterize like super(parameter)
			
	/****************    IMP Note for constructor    *****************************
			A constructor that doesn't have an explicit call to a super class constructor will be added an implicit call to the parameterless constructor (as if the super(); 
			statement was added a its first statement).

			In your case, since the super class has a constructor with parameters, it has no parameterless constructor, so super(); 
			can't pass compilation, and you must call super(text) explicitly.
	*****************************/	
		}
	}
		
	
	
}
