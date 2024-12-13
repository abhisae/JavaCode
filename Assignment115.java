package assignmentpackage;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment115
{

	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("cat");
		a1.add("horse");
		a1.add("rat");
		a1.add("dog");
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
	}

}
