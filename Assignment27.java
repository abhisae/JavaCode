package assignmentpackage;

public class Assignment27 {
	
	int a=16;
	int b=4;
	
	void add()
	{
		System.out.println(a+b);
	}
	
	void substraction()
	{
		System.out.println(a-b);
	}
	void multiplication()
	{
		System.out.println(a*b);
	}
	void division()
	{
		System.out.println(a/b);
	}
	void modulus()
	{
		System.out.println(a%b);
	}
	
	
	
	public static void main(String[] args)
	{
		Assignment27 a27=new Assignment27();
		a27.add();
		a27.substraction();
		a27.multiplication();
		a27.division();
        a27.modulus();
	}

}
