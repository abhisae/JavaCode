package assignmentpackage;

public class Assignment68 
{

	public static void main(String[] args)
	{
		String s="Abhijit";
		String s1="     Rutuja      ";
		System.out.println("The Lenghth of String is:"+s.length());
		System.out.println("The Uppercase is:"+s.toUpperCase());
		System.out.println("The Lowercase is:"+s.toLowerCase());
		System.out.println("The result after trim is:"+s1.trim());
		System.out.println("The character index is:"+s.charAt(3));
		System.out.println("The indexof Given Characher is:"+s.indexOf('j'));
		System.out.println("The substring with one parameters:"+s.substring(4));
		System.out.println("The substing with two parameters:"+s.substring(2,6));
		System.out.println("The result after equals:"+s.equals("Abhi"));
        System.out.println("The result after contains:"+s.contains("Abhi"));
        System.out.println("The result after equal ignore case:"+s.equalsIgnoreCase("abhijit"));
    }

}
