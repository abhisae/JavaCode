package assignmentpackage;

public class Assignment81
{

	public static void main(String[] args)
	{
		double a[]=new double[5];
		a[0]=5;
		a[1]=8;
		a[2]=16;
		a[3]=20;
		a[4]=5;
		double sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The sum is: "+sum);
		double avarage=sum/a.length;
		System.out.println("The avarage of array is: "+avarage);
	}

}
