package assignmentpackage;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment106
{

	public static void main(String[] args) 
	{
		Collection c1=new ArrayList();
		c1.add("Cat");
		c1.add("Dog");
		c1.add("Horse");
		c1.add("Rat");
		System.out.println(c1);
		c1.remove("Rat");
        System.out.println(c1);
	}

}
