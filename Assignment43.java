package assignmentpackage;

import java.util.Scanner;

public class Assignment43 {

	public static void main(String[] args) 
	{
		// Circumference triangle = a + b + c , a, b, and c are the lengths of the triangle's sides
		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter side 1");
		double s11 = s1.nextDouble();

		System.out.println("Enter side 2");
		double s12 = s1.nextDouble();

		System.out.println("enter side 3");
		double s13 = s1.nextDouble();

		double cot = s11 + s12 + s13;
		System.out.println(" Circumference of triangle is " +  cot);

	}

}
