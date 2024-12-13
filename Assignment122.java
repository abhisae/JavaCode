//Write a program using the Equals() method in the Map Interface.

package assignmentpackage;
import java.util.HashMap;
import java.util.Map;

public class Assignment122
{
	public static void main(String[] args) 
	{
		Map<String,Character> m1=new HashMap<String,Character>();
		m1.put("Abhijit",'M');
		m1.put("Rutuja",'F');
		m1.put("Suhas",'M');
		m1.put("Shaila",'F');
		m1.put("Dhruvi",'F');
		Map<String,Character> m2=new HashMap<String,Character>();
		m2.put("Abhijit",'M');
		m2.put("Rutuja",'F');
		m2.put("Suhas",'M');
		m2.put("Shaila",'F');
		m2.put("Dhruvi",'F');
		boolean b1=m1.equals(m2);
		System.out.println(b1);
	}

}
