package assignmentpackage;

import java.util.Arrays;

public class Assignment80 
{
    static int countof_alphabet=0;
    static int countof_digit=0;
    static int countof_whitespace=0;
	public static void main(String[] args)
	{
		String a="kv no 2";
		char c1[]=a.toCharArray();
		System.out.println(Arrays.toString(c1));
        for(int i=0;i<a.length();i++)
        {
        	boolean v1=Character.isAlphabetic(c1[i]);
        	if(v1==true)
        	{
        		countof_alphabet++;
        	}
        	boolean v2=Character.isDigit(c1[i]);
        	if(v2==true)
        	{
        		countof_digit++;
        	}
        	boolean v3=Character.isWhitespace(c1[i]);
        	if(v3==true)
        	{
        		countof_whitespace++;	
        	}
        	
        }
        System.out.println("The count of Alphabet is: "+countof_alphabet);
        System.out.println("The count of digit is: "+countof_digit);
        System.out.println("The count os spaces is: "+countof_whitespace);
	}

}
