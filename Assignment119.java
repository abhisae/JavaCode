//Write a program to print name and Salary using the put() method in the Map Interface.

package assignmentpackage;

import java.util.HashMap;
import java.util.Map;

public class Assignment119
{

	public static void main(String[] args)
	{
		Map<String,Double> m1=new HashMap<String,Double	>();
        m1.put("Abhijit",100000.00);
        m1.put("Rutuja",98675.25);
        m1.put("Shaila",54231.90);
        m1.put("Suhas",76543.78);
        System.out.println(m1);
	}

}
