//Write a program to print name and gender using the put() method in the Map Interface.

package assignmentpackage;

import java.util.HashMap;
import java.util.Map;

public class Assignment118
{

	public static void main(String[] args) 
	{
		Map<String,Character> m1=new HashMap<String,Character>();
		m1.put("Abhijit",'M');
		m1.put("Rutuja",'F');
		m1.put("Suhas",'M');
		m1.put("Shaila",'F');
		m1.put("Dhruvi",'F');
        System.out.println(m1);
	}

}
