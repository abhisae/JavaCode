package assignmentpackage;

import java.util.Scanner;

public class Assignment39 
{

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		// AoT = 0.5 * b * h
		System.out.println("Enter base of a triangle");
		double b = s1.nextDouble();

		System.out.println("Enter height of a triangle");
		double h = s1.nextDouble();

		double AOT = 0.5 * b * h;
		System.out.println("Area of a Triangle is " +AOT);

	}

}
