package assignmentpackage;

import java.util.HashMap;
import java.util.Map;

public class Assignment124
{

	public static void main(String[] args)
	{
		Map<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("Rice",10);
		m1.put("Jaggery",20);
		m1.put("Wheat",10);
		m1.put("Sugar",8);
		m1.put("Salt",1);
		System.out.println(m1);
        m1.remove("Rice");  //By using Remove method remove Key
        System.out.println("After removing Key:"+m1);
        m1.remove("Sugar",8); //By using Remove method remove Key and Value
        System.out.println("After Removing Key and Value:"+m1);
	}

}
