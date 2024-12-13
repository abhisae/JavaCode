package assignmentpackage;

public class Assignment22 {
	
	Assignment22(int a)
	{
		System.out.println("This is First Constructor");
		
	}
	
	Assignment22(double a)
	{
		System.out.println("This is Second Constructor");
	}

	public static void main(String[] args) 
	{
		new Assignment22(10);
		new Assignment22(3.14);
	}

}
