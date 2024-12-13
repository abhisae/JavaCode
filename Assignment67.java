package assignmentpackage;
interface one
{
	void add();
	void sub();
}
interface two
{
	void mul();
	void div();
}
public class Assignment67 implements one,two
{
	public void add()
	{
		System.out.println("This add method inside interface one");
	}
	public void sub()
	{
		System.out.println("This sub method inside interface one");
	}
	public void mul()
	{
		System.out.println("This mul method inside interface two");
	}
	public void div()
	{
		System.out.println("This div method inside interface two");
	}

	public static void main(String[] args)
	{
		Assignment67 a67=new Assignment67();
		a67.add();
		a67.sub();
		a67.mul();
		a67.div();
	}
}
