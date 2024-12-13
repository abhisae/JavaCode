//Write a Program for Multi Level Inheritance
package assignmentpackage;

 class Parent11
{
	public void add()
	{
		System.out.println("This is Add method in the Parent11");
	}
	
	static void hello()
	{
		System.out.println("Hello inside Parent11");
	}
}
 class Parent21 extends Parent11
{
	public void sub()
	{
		System.out.println("This is Sub method in the Parent21");
	}
	
	static void hello1()
	{
		System.out.println("Hello1 inside Parent21");
	}
}
public class Assignment51 extends Parent21
{
	public void div()
	{
		System.out.println("This is Dive in child");
	}

	public static void main(String[] args)
	{
		Assignment51 a51=new Assignment51();
		a51.add();
		hello();
		a51.sub();
		hello1();
		a51.div();	
	}

}
