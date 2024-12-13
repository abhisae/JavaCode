//Write a program to find out Circumference of Square using scanner class - C = 4 * a. where a is the side length.

package assignmentpackage;

import java.util.Scanner;

public class Assignment46
{

	public static void main(String[] args)
	{
		System.out.println("Enter side of a square");
		Scanner s1 = new Scanner(System.in);
		double r = s1.nextDouble();

		double COS = 4 * r;

		System.out.println("Circumference of Square is " +COS);
	}

}
