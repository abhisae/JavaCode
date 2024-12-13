package assignmentpackage;
interface Addition
{
	void add();
}
public class Assignment65 implements Addition
{
	public void add()
	{
		System.out.println("Here we implement real Logic");
	}
	public static void main(String[] args) 
	{
		Assignment65 a65=new Assignment65();
		a65.add();

	}
}
