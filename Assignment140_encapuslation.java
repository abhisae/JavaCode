package assignmentpackage;

class Amazon
{
	private String un="abhisae@gmail.com";

	public String getUn()
	{
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}
}

public class Assignment140_encapuslation
{

	public static void main(String[] args) 
	{
		Amazon a1=new Amazon();
		a1.setUn("Abhijit.Ghate@cyncly.com");
		System.out.println(a1.getUn());
	}

}
