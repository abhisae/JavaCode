//Write a program to find out Circumference of rectangle using scanner class


package assignmentpackage;

import java.util.Scanner;

public class Assignment45 
{

	public static void main(String[] args)
	{
		System.out.println("Enter Length of a rectangle");
		Scanner s1 = new Scanner(System.in);
		double l = s1.nextDouble();

		System.out.println("Enter width of a rectangle");
		Scanner s2 = new Scanner(System.in);
		double w = s2.nextDouble();

		double COR = 2*(l+w);
		System.out.println("Circumference of rectangle  is " +COR);

	}

}
