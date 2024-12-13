package assignmentpackage;

public class Assignment59 
{
	int age=25;
	String Name="Abhijit";
	double salary=100000;
	
	void emp_details(int age,String Name,double salary)
	{
		this.age=age;
		this.Name=Name;
		this.salary=salary;
	}
	public static void main(String[] args)
	{
		Assignment59 a59=new Assignment59();
		System.out.println(a59.age);
		System.out.println(a59.Name);
		System.out.println(a59.salary);
	}

}
