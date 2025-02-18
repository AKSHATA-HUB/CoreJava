package DaySeven;

public class MethodOverriding {

	public static void main(String[] args) {
			RBI rbi;
			//Dynamic binding child class object to parent class refer variables
			
			rbi=new RBI();
			System.out.println(rbi.getRateOfIntrest());
			
			rbi=new SBI();
			System.out.println(rbi.getRateOfIntrest());
			
			rbi=new HDFC();
			System.out.println(rbi.getRateOfIntrest());
	}

}
