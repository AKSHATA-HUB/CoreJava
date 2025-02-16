package FirstPackage;

public class Base {

	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	//declare a methods with diff access modifier
	
	void methodDeafult()
	{
	
		System.out.println("default access Base class ");
		System.out.println("default varible: "+ varDefault);
	}
	
	public void methodPublic()
	{
	
		System.out.println("Public access Base class ");
		System.out.println("Public varible: "+ varPublic);
	}
	
	private void methodPrivate()
	{
	
		System.out.println("Private access Base class ");
		System.out.println("Private varible: "+ varPrivate);
	}
	
	protected void methodProtected()
	{
	
		System.out.println("Protected access Base class ");
		System.out.println("Protected varible: "+ varProtected);
	}
}
