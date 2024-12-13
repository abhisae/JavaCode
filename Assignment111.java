package assignmentpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assignment111 
{

	public static void main(String[] args) 
	{
		List l1=new ArrayList();
		l1.add(765);
		l1.add("Moon");
		l1.add("Sun");
		
		System.out.println(l1);
		
		Iterator i1= l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("This is Forward Iteration");
		ListIterator i2=l1.listIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("This backword Iteration");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
	}

}
