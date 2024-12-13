//Write a program to create Array of size as 4 to store Int data type values at the run time

package assignmentpackage;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment76 {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);	
		int age[]=new int[4];
		for(int i=0;i<=3;i++)
		{
			age[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(age));

	}

}
