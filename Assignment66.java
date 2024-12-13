package assignmentpackage;

interface classInterface
{
	void mul();
	void div();
	
}
abstract class Test implements classInterface
{
	abstract void mul1();
	abstract void div1();
	void looptoprintname()
	{
		System.out.println("Logic to expose");
	}
}
public class Assignment66 extends Test
{
	public void mul()
	{
	  System.out.println("Logic to expose multiplication");
	}
	public void div()
	{
		System.out.println("Logic to expose Division");
	}
	void mul1()
	{
		System.out.println("Logic to expose multiplication1");
	}
	void div1() 
	{
		System.out.println("Logic to expose Division1");
	}
	public static void main(String[] args)
	{
		Assignment66 a66=new Assignment66();
		a66.mul();
		a66.div();
		a66.mul1();
		a66.div1();
        a66.looptoprintname();
	}
}
