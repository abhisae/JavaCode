package assignmentpackage;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment113_e 
{
   public static void main(String[] args)
   {
	   HashSet h1=new HashSet();
	   h1.add("Rose");
	   h1.add("Tulip");
	   h1.add("Sunflower");
	   h1.add(null);
	   h1.add(null);
	   h1.add(10);
	   System.out.println(h1);
	   Iterator i1=h1.iterator();
	   while(i1.hasNext())
	   {
		   System.out.println(i1.next());
	   }
	
   }
}
