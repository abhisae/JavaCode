package assignmentpackage;

public class Assignment26 {
	
	int a=10; //Non static global variable.
	static int b=30; //Static global variable.
	
	static void add()
	{
		int a=100; //Local Variable
		a=101; // Value has been updated 
		int b=200;
		int sum=a+b;
		System.out.println("The addtion is"+sum);	
		
	}

	public static void main(String[] args) 
	{
		add();
		b=60; // Update the values of Static global variable.
		System.out.println(b);
		Assignment26 a26=new Assignment26();
		a26.a=500; // update the value of non-static global variable.
		System.out.println(a26.a);

	}

}
