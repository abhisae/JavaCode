//Write a program for constructor - single level inheritance using a non-parameterized super calling statement with explicit invocation
package assignmentpackage;

class Google1
{
	Google1(int a)
	{
		System.out.println("This is Parameterized constructor of Google class");
	}
}

public class Assignment55_GoogleAuth extends Google1
{
	 Assignment55_GoogleAuth()
	{
		super(100);
		System.out.println("This is Google Auth class Constructor");
	}

	public static void main(String[] args) 
	{
		new Assignment55_GoogleAuth();
     
	}

}
