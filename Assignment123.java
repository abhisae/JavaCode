package assignmentpackage;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Assignment123
{
	public static void main(String[] args)
	{
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("Rutuja","Ab001");
		m1.put("Abhijit","Ab002");
		m1.put("Dhruvi","Ab003");
		m1.put("Shaila","Ab004");
		m1.put("Suhas","Ab005");
		System.out.println(m1);
		System.out.println("Fetaching the Keys:-");
		for(String s1:m1.keySet()) //keySet method used to fetch the Keys.
		{
			System.out.println(s1);
		}
		System.out.println("Fetaching the Values:-");
		for(String s2:m1.values()) //values method used to fetch the values.
		{
			System.out.println(s2);
		}
		System.out.println("Fetching the Key and Values Together:-");
		for(Entry<String,String> s3:m1.entrySet()) // entrySet() method is used to fetch key and its value together
		{
			System.out.println(s3);
    	}
	}
}
