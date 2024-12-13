//Write a program to find out Current time,Future Time,Past time

package assignmentpackage;

import java.util.Date;
public class Assignment98 
{

	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		System.out.println(d1.getTime()+(1000*60*60*24));//Future Time
		System.out.println(d1.getTime()-(1000*60*60*24));//Past Time
		
		Date d2=new Date(d1.getTime());
	}

}
