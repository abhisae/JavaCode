package assignmentpackage;

class Parent2
{
	public void add()
	{
		System.out.println("This is add method in parent");
	}
	static void mul()
	{
		System.out.println("This is mul in Parent");
	}
}
public class Assignment50 extends Parent2
{
    static void sub()
    {
    	System.out.println("This is sub method in child");
    }
    public void div()
    {
    	System.out.println("This is Division in child");
    }
    public static void main(String[] args) 
	{
		Assignment50 a50=new Assignment50();
		a50.add();
		a50.div();
		mul();
		sub();
	}

}
