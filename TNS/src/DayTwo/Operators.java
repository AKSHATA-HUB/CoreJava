package DayTwo;

public class Operators {

	public static void main(String[] args) {
		int a=45;
		int b=25;
		int c=10;
		System.out.println("a and b values before the"+"operator :"+ a+" " +b);
		++a;
		int x=++a + b + a--;
		System.out.println("value of c:"+x);
		int d=x++ +a + b--;
		

	}

}
