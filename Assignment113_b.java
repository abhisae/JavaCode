package assignmentpackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;


public class Assignment113_b 
{

	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.add("Rose");
		l1.add("Sunflower");
		l1.add("Tulip");
		l1.add("Orchid");
		l1.add("Orchid");
		//l1.add(null);
		//l1.add(10);
		System.out.println("Before Sort :");
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println("After Sort :");
		System.out.println(l1);
		ListIterator i1= l1.listIterator();
		System.out.println("This is Forward Next: ");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("This is Backward Next: ");
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}
	}

}
