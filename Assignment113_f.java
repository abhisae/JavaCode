package assignmentpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Assignment113_f 
{

	public static void main(String[] args)
	{
		LinkedHashSet l1=new LinkedHashSet();
		l1.add("Rose");
		l1.add("Tulip");
		l1.add("Orchid");
		l1.add(null);
		l1.add(null);
		l1.add(10);
		System.out.println(l1);
		Iterator i1=l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
