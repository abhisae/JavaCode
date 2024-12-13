package assignmentpackage;

public class Assignment23 {
	
	public void meth(int a)
	{
		System.out.println(a);
	}
	
	public void meth(double a)
	{
		System.out.println(a);
	}

	public static void main(String[] args)
	{
		Assignment23 a23= new Assignment23();
		a23.meth(10);
		a23.meth(2.14);

	}

}
