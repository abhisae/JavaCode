package assignmentpackage;

import java.util.Scanner;
public class Assignment47 {
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the input:");
		int input=s1.nextInt();	
		switch(input)
		{
		case 1:
			System.out.println("This is Chrome Browser");
			break;
		case 2:
			System.out.println("This is Morzilla Browser");
			break;
		case 3:
			System.out.println("This is Edge Browser");
			break;
		case 4:
			System.out.println("This is Opera Browser");
			break;
		default:
			System.out.println("Please select valid input");
		}

	}

}
