package assignmentpackage;

import java.util.HashMap;
import java.util.Map;

public class Assignment127
{

	public static void main(String[] args)
	{
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("Abhijit","001");
		m1.put("Rutuja","002");
		m1.put("Dhruvi","003");
		m1.put("Shaila","004");
		m1.put("Suhas","005");
		System.out.println(m1);
		m1.clear();
		System.out.println(m1);
		System.out.println(m1.isEmpty());
	}

}
