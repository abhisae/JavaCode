package assignmentpackage;

import java.util.HashMap;
import java.util.Map;

public class Assignment125 
{

	public static void main(String[] args)
	{
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("Rutuja","Ab001");
		m1.put("Abhijit","Ab002");
		m1.put("Suhas","Ab003");
		m1.put("Shaila","Ab004");
		m1.put("Dhruvi","Ab005");
		System.out.println(m1.get("Suhas"));

	}

}
