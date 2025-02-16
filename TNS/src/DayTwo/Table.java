package DayTwo;

public class Table {
	public static void main(String args[]) {
		int start=10;
		int end=20;
		for(int i=start;i<=end;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"=" +i*j);
			}
			System.out.println();
		}
		System.out.println();
	}
}
