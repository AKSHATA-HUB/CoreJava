package DayThree;

public class Tax_calc {
	public void calculate_tax(Person person) {
		//							Female FEMALE FeMale
		if(person.getAge()>65 ||person.getGender().equalsIgnoreCase("female")) {
			person.setTax(0);
			System.out.println("Tax not applicable");
			}
		else {
			if(person.getIncome()<=200000) {
				person.setTax(0);
			}
		}
			else if(person.getIncome()>200000 && person.getIncome()<=500000) {
			person.setTax((person.getIncome()-200000)*10/100);
		}
			else if(person.get)
	}

	
			


	}

