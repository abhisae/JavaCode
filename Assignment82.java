package assignmentpackage;

import java.util.Arrays;

public class Assignment82
{

	public static void main(String[] args)
	{
		int input[]=new int[5];
		input[0]=5;
		input[1]=8;
		input[2]=16;
		input[3]=20;
		input[4]=5;
		int output[]=new int[input.length];	
		for(int i=0,j=4;i<input.length;i++,j--)
		{
			output[j]=input[i];
		}
		System.out.println("The original array is: "+Arrays.toString(input));
		System.out.println("The reverse array is: "+Arrays.toString(output));
	}

}
