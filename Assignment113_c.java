package assignmentpackage;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Assignment113_c 
{

	public static void main(String[] args) 
	{
		PriorityQueue p1=new PriorityQueue();
		p1.add("Rose");
		p1.add("Sunflower");
		p1.add("Orchid");
		p1.add("Tulip");
		p1.add("Tulip");
		System.out.println(p1);
		Iterator i1=p1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
