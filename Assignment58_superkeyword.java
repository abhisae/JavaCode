//Write a program for method overriding usig super keyword
package assignmentpackage;
class Google123
{
	void login()
	{
		System.out.println("Login with Mobile");
	}
}
public class Assignment58_superkeyword extends Google123
{
	void login()
	{
		super.login();
		System.out.println("Login with emailID");
	}
	public static void main(String[] args)
	{
		Assignment58_superkeyword A58=new Assignment58_superkeyword();
		A58.login();
	}
}
