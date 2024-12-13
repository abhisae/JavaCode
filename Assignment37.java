package assignmentpackage;


import java.util.Scanner;	

public class Assignment37 {
	
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		
		System.out.println("Enter the First Number:");
		int a=s1.nextInt();
		System.out.println("Enter the Second Number:");
		int b=s1.nextInt();
		
		int sum=a+b;
		System.out.println("The addition is:"+sum);
		
		int sub=a-b;
		System.out.println("The Substraction is:"+sub);
		
		int mul=a*b;
		System.out.println("The multiplication is:"+mul);
		
		int div=a/b;
		System.out.println("The division is:"+div);
		
		int mod=a%b;
		System.out.println("The modulus is:"+mod);
		
	}

}
