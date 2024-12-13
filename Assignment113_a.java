package assignmentpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Assignment113_a 
{

	public static void main(String[] args)
	{
		Vector v1=new Vector();
		v1.add("Mango");
		v1.add("Papaya");
		v1.add("Guvava");
		v1.add("Pineapple");
		v1.add("Apple");
		/*v1.add(null);
		v1.add(null);
		v1.add(10);*/
		System.out.println("Before Sort :");
		System.out.println(v1);
		Collections.sort(v1);
		System.out.println("After Sort :");
		System.out.println(v1);
		Iterator i1=v1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
