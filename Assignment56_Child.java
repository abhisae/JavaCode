//Write a program for constructor inheritance- Multi level using a parameterized super calling statement with explicit invocation
package assignmentpackage;
class GrandParent
{
	GrandParent(int a,int b)
	{
		System.out.println("This is GrandParent Constructor");
	}
}
class Parent111 extends GrandParent
{
	Parent111(int a,int b, int c)
	{
		super(10,20);
		System.out.println("This is Parent Constructor");
	}
}
public class Assignment56_Child extends Parent111
{
	Assignment56_Child()
	{
		super(30,40,50);
		System.out.println("This is child constuctor");
	}
	public static void main(String[] args) 
	{
		new Assignment56_Child();
	}

}
