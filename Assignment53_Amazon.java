//Write a program for constructor inheritance using the super calling statement with Implicit Invocation

package assignmentpackage;

class Google
{
	Google()
	{
		System.out.println("This is Google Constructor");
	}
}

public class Assignment53_Amazon extends Google {
	
	Assignment53_Amazon()
	{
		System.out.println("This is Amazon Constructor");
	}

	public static void main(String[] args) 
	{
		new Assignment53_Amazon();

	}

}
