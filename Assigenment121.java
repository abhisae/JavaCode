package assignmentpackage;

import java.util.HashMap;
import java.util.Map;

public class Assigenment121 
{

	public static void main(String[] args)
	{
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("Abhijit","001");
		m1.put("Rutuja","102");
		m1.put("Dhruvi","103");
		System.out.println("Original Value"+m1);
		m1.putIfAbsent("Amruta","104");
		System.out.println("Updated Value"+m1);

	}

}
