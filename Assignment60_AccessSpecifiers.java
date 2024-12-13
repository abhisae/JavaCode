//Write a program to check which method access specifiers are accessable inside same class
package assignmentpackage;

public class Assignment60_AccessSpecifiers
{
	 private void add()	
	   {
		   System.out.println("This is addition");
	   }
	 public void sub()	
	   {
		   System.out.println("This is substraction ");
	   }
	 protected void mul()	
	   {
		   System.out.println("This is Multiplication");
	   }
	  void div()	
	   {
		   System.out.println("This is Division");
	   }
	public static void main(String[] args) 
	{
		Assignment60_AccessSpecifiers a1=new Assignment60_AccessSpecifiers();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
	}
}
