package assignmentpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Assignment113
{

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("Cat");
		a1.add("Dog");
		a1.add("Elephant");
		a1.add("Amba");
		/*a1.add(10);
		a1.add(null);
		a1.add(null);*/
		System.out.println("Before Sort:");
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println("After Sort"+a1);
		Iterator i1=a1.iterator();
	    while(i1.hasNext())
	    {
	    	System.out.println(i1.next());
	    }
	}

}
