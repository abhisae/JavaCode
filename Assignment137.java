package assignmentpackage;

public class Assignment137 
{
	public static void main(String[] args)
	{
		try
		{
		   int c=1/0;
		   System.out.println(c);
		}
		catch(ArithmeticException m1)
		{
			System.out.println("Sorry there is Problem,but you can proceed");
		}
	}

}
