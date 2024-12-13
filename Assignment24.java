package assignmentpackage;

public class Assignment24 {
	
	static void meth(int a)
	{
		System.out.println(a);
	}
	static void meth(float a)
	{
		System.out.println(a);
	}
	static void meth(double a)
	{
		System.out.println(a);
	}
	static void meth(char a)
	{
		System.out.println(a);
	}
	static void meth(String a)
	{
		System.out.println(a);
	}
    
	public void meth1(int a)
	{
		System.out.println(a);
	}
	public void meth1(float a)
	{
		System.out.println(a);
	}
	public void meth1(double a)
	{
		System.out.println(a);
	}
	public void meth1(char a)
	{
		System.out.println(a);
	}
	public void meth1(String a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{

		meth(10);
		meth(2.14);
		meth(6.5897);
		meth('A');
		meth("Abhijit");
		
		Assignment24 a24=new Assignment24();
		a24.meth1(30);
		a24.meth1(7.5);
		a24.meth1(9.7865);
		a24.meth1('D');
		a24.meth1("Dhruvi");
	}

}
