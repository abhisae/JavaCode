// Assignment 44 - Write a program to find out Circumference of circle using scanner class
package assignmentpackage;

import java.util.Scanner;

public class Assignment44 {

	public static void main(String[] args)
	{
		System.out.println("Enter the radius of circle");
		Scanner s1 = new Scanner(System.in);
		double r = s1.nextDouble();
		double cum = 2* Math.PI * r; 
		System.out.println(" Circumference of circle is" +cum);

	}

}
