package assignmentpackage;

import java.util.Scanner;

public class Assignment42 
{

	public static void main(String[] args)
	{
		// AOS = side * side

		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter the side of square");
		double s = s1.nextDouble();

		double AOS = s * s;
		System.out.println("Area of Square " + AOS);

	}

}
