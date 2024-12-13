package assignmentpackage;

import java.util.Iterator;
import java.util.TreeSet;

public class Assignment113_d
{

	public static void main(String[] args) 
	{
		TreeSet t1=new TreeSet();
		t1.add("Rose");
		t1.add("Rose");
		t1.add("Tulip");
		t1.add("Orchid");
		t1.add("Sunflower");
		System.out.println(t1);
		Iterator i1=t1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		

	}

}
