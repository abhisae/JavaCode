package assignmentpackage;

public class Assignment57_this
{
	Assignment57_this()
    {
		this("Abhijit");
		System.out.println("This is non para constructor");
	}
	
	Assignment57_this(String str)
	{
		System.out.println("This is Parameterized constrctor");
	}

	public static void main(String[] args)
	{
		new Assignment57_this();

	}

}
