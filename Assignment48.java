package assignmentpackage;

class Parent
{
	static void add()
	{
		System.out.println("This is Addition method in Parent class");
	}
}

public class Assignment48 extends Parent
{
	static void sub()
	{
		System.out.println("This is Substraction method in Child class");
	}

	public static void main(String[] args)
	{
		add();
		sub();

	}

}
