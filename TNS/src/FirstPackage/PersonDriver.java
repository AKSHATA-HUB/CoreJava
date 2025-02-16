package FirstPackage;


public class PersonDriver {

	public static void main(String[] args) {
	
		
		Person p=new Person();
		p.setpName("Riza");
		p.setpCity("Pune");
		
		System.out.println(p.getpName()+"\t"+p.getpCity());

		
		Person p1=new Person("Aakash", "Mumbai");
		System.out.println(p1);
	}

}
