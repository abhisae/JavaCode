package assignmentpackage;

class Parent1
{
	public void add()
	{
		System.out.println("This is add method in parent");
	}
}

public class Assignment49 extends Parent1
{
	public void sub()
	{
		System.out.println("This is sub method in Child");
	}

	public static void main(String[] args)
	{
		Assignment49 A49= new Assignment49();
		A49.add();
		A49.sub();

	}

}
