package FirstPackage;


public class Excuetor {

	public static void main(String[] args) {
	
		
		//accessing within same package
		
		Base b1=new Base();
		b1.methodPublic();
		b1.methodDeafult();
		b1.methodProtected();
		//b1.methodPrivate();
		
		b1.varDefault=11;
		b1.methodDeafult();
		
		b1.varProtected=41;
		 b1.methodProtected();

	}

}