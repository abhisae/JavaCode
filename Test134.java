package package1;

import java.util.ArrayList;
import java.util.Collection;

public class Test134 
{

	public static void main(String[] args) 
	{
		Collection c1=new ArrayList();
		c1.add("Abhijit");
		c1.add("Rutuja");
		c1.add("Dhruvi");
		c1.add('x');
		c1.add(123);
		System.out.println(c1);
		System.out.println(c1.contains("Dhruvi"));
		
		Collection c2=new ArrayList();
		c2.add("Abhijit");
		c2.add("Rutuja");
		c2.add("Dhruvi");
		c2.add('x');
		c2.add(123);
		c2.add("Eshan");
		
		System.out.println(c2.containsAll(c1));
		
		System.out.println(c1.isEmpty());
		
	}

}
