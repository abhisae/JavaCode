package assignmentpackage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Assignment109 
{
	public static void main(String[] args) 
	{
		Collection c1=new ArrayList();
		c1.add("Cat");
		c1.add("Dog");
		c1.add("Horse");
		c1.add("Rat");
		c1.add("Elephant");
		c1.add(11);
		c1.add('X');
		c1.add(9.87);
		c1.add(true);
		System.out.println(c1);
		Iterator i1= c1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
