package assignmentpackage;

import java.util.Scanner;

//Write a program to find out area of  Circle using scanner class


public class Assignment40 {

	public static void main(String[] args) 
	{
		// AOC = 3.14 * r * r
		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter radius of a Circle");
		double  r = s1.nextDouble();

		double AOC = Math.PI * r * r;
		System.out.println(" Area of circle is " + AOC);

	}

}
