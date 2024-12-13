// Write a program which contains 1 abstract class, inside that abstrat class mention 2 abstract method, 1 concrete non static method, 1 concrete static method. override the non static methods
//(abstract menthods+non static concrete method) and call all the methods in main method to execute.
package assignmentpackage;
abstract class Google_Auth
{
	abstract void login();
	abstract void registration();
	void meth()
	{
		System.out.println("This is nonstatic concrete method of Google Auth");
	}
	static void meth1()
	{
		System.out.println("This is static concrete method of Google Auth");
	}
}
public class Assignment64 extends Google_Auth
{
	void login()
	{
		System.out.println("This is API1");
	}
	void registration() 
	{
		System.out.println("This is API2");
	}
    public static void main(String[] args)
    {
    	Assignment64 a64=new Assignment64();
    	a64.login();
    	a64.registration();
    	a64.meth();
    	meth1();
	
    }
}
