package assignmentpackage;

public class Assignment21 {
	
	static void meth1() // Static Non Prameterized method  
	{
		System.out.println("This is Static Method and Non Prameterized method ");
		
	}
	
	void meth2() // Non Static Non Prameterized method
	{
		System.out.println("This is Non Static and Non Prameterized method");
	}
	
	 Assignment21()// Costructor
	{
		System.out.println("This is Non Parameterized constructor");
	}
	

	public static void main(String[] args) 
	{
		meth1();
		Assignment21 a1= new Assignment21();
		a1.meth2();
	}

}
