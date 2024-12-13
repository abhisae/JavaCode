package assignmentpackage;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment105 
{

	public static void main(String[] args) 
	{
		Collection c1=new ArrayList();
		c1.add("Cat");
		c1.add("Dog");
		c1.add("Horse");
		c1.add(11);
		c1.add('Z');
		c1.add(9.87);
		c1.add(true);
		System.out.println(c1);
		Collection c2=new ArrayList();
		c2.addAll(c1);
		c2.add("Lion");
		c2.add("Tiger");
		System.out.println(c2);
		System.out.println(c2.containsAll(c1));

	}

}
