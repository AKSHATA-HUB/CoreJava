package FirstPackage;


public class Person {

	
	//data members
	
	private String pName;
	private String pCity;
	
	//getter and setter method 
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpCity() {
		return pCity;
	}
	public void setpCity(String pCity) {
		this.pCity = pCity;
	}
	
	//default constructor 
	public Person() {
		
	}
	//para constructor 
	public Person(String pName, String pCity) {
		
		this.pName = pName;
		this.pCity = pCity;
	}
	
	//to String 
	@Override
	public String toString() {
		return "Person [pName=" + pName + ", pCity=" + pCity + "]";
	}
	
	
	
	
}