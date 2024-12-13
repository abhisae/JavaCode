//Write a program to create a static method along with a main method that performs addition, subtraction, multiplication, and division.

package assignmentpackage;

public class Assignment3 {
	

	static void add()
	{
		int a=100;
		int b=90;
		int c=a+b;
		System.out.println(c);
				
	}
	
	static void sub()
	{
		int a=100;
		int b=90;
		int c=a-b;
		System.out.println(c);
	}
	
	static void mul()
	{
		int a=100;
		int b=90;
		int c=a*b;
		System.out.println(c);
	}
	
	static void div()
	{
		int a=50;
		int b=25;
		int c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		add();
		sub();
		mul();
		div();
		

	}

}
