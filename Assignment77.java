//Write a program to check if 2 Arrays are equals or not

package assignmentpackage;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment77 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int age[]=new int[4];
		int age1[]=new int[4];
		for(int i=0;i<=3;i++)
		{
			age[i]=s1.nextInt();
			
		}
		for(int j=0;j<=3;j++)
		{
			age1[j]=s1.nextInt();
		}
		System.out.println(Arrays.toString(age));
		System.out.println(Arrays.toString(age1));
		boolean b1=Arrays.equals(age,age1);
		System.out.println(b1);

	}

}
