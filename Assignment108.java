package assignmentpackage;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment108
{
	public static void main(String[] args)
	{
		Collection c1=new ArrayList();
		c1.add("Cat");
		c1.add("Dog");
		c1.add("Rat");
		c1.add("Elephant");
		c1.add(3.14);
		System.out.println(c1);
		System.out.println("The Size of the collection is:"+c1.size());
	}

}
