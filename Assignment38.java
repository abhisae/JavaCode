//Write a program to do declaration and initialisation of all methods of Scanner class

package assignmentpackage;

import java.util.Scanner;

public class Assignment38
{

	public static void main(String[] args) 
	{
		System.out.println("Enter Number 1 int");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		System.out.println("Enter Number 2 short");
		Scanner s2 = new Scanner(System.in);
		short b = s2.nextShort();
		System.out.println("Enter Number 3 byte ");
		Scanner s3 = new Scanner(System.in);
		byte c = s3.nextByte();
		System.out.println("Enter Number 4 long");
		Scanner s4 = new Scanner(System.in);
		long d = s4.nextLong();
		System.out.println("Enter Number double");
		Scanner s5 = new Scanner(System.in);
		double e = s5.nextDouble();
		System.out.println("Enter Boolean ");
		Scanner s6 = new Scanner(System.in);
		boolean f = s6.nextBoolean();
		System.out.println("Enter char");
		Scanner s7 = new Scanner(System.in);
		String g = s7.next();
		System.out.println("Enter String");
		Scanner s8 = new Scanner(System.in);
		String h = s8.next();
		System.out.println("Entr Float");
		Scanner s9 = new Scanner(System.in);
		float i = s9.nextFloat();
	}

}
