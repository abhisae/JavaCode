package assignmentpackage;

public class Assignment25 {
	
	void meth1(int a)
	{
		System.out.println(a);
	}
	
	void meth1(double a)
	{
		System.out.println(a);
	}
	
	Assignment25(int b)
	{
		System.out.println("This is first constructor: "+b);
	}
	
	Assignment25(double b)
	{
		System.out.println("This is Second Constructor: "+b);
	}

	public static void main(String[] args) 
	{
		new Assignment25(3.14);
		
		Assignment25 a25= new Assignment25(10);
		a25.meth1(25);
		a25.meth1(7.85);
	}

}
