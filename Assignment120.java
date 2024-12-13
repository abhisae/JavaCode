package assignmentpackage;

import java.util.HashMap;
import java.util.Map;

public class Assignment120
{

	public static void main(String[] args)
	{
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("Abhijit","001");
		m1.put("Rutuja","102");
		m1.put("Dhruvi","103");
		
		Map<String,String> m2=new HashMap<String,String>();
		m2.put("Shaila","201");
		m2.put("Suhas","202");
		
		m2.putAll(m1);
		System.out.println(m2);

	}

}
