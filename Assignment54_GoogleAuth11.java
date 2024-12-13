//Write a program for constructor - single level inheritance using a non-parameterized super calling statement with explicit invocation
package assignmentpackage;

class Google11
{
	Google11()
	{
		System.out.println("This is Google11 constructor");
	}
}

public class Assignment54_GoogleAuth11 extends Google11
{
	Assignment54_GoogleAuth11()
	{
		super();
		System.out.println("This is Google_Auth11 Constructor");
	}

	public static void main(String[] args) 
	{
		new Assignment54_GoogleAuth11();

	}

}
