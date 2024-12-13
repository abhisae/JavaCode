package assignmentpackage;

import java.util.Scanner;

public class Assignment41 {

	public static void main(String[] args)
	{
		// AOR = l * w;

		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter the length of rectangle");
		double l = s1.nextDouble();

		System.out.println(" Enter the width of rectangle");
		double w = s1.nextDouble();

		double AOR = l * w;
		System.out.println("Area of Rectangle is " + AOR);

	}

}
