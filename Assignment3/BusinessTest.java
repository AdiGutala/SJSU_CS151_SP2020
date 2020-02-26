
public class BusinessTest {
	
	static Address add = new Address();

	public static void main(String[] args) {
		
		add.setStreetName("Grover Street");
		
		Customer joe = new Customer("Joe", "Smith");
		joe.setPaymentMethod("direct deposit");
		joe.setAge(19);
		joe.setIdNumber(12414);
		joe.setAccomodation(false);
		joe.introduce();
		joe.makePayment();
		
		Customer jake = new Customer("Jake", "Smith");
		joe.setPaymentMethod("direct deposit");
		joe.setAge(23);
		joe.setIdNumber(12493);
		joe.setAccomodation(true);
		joe.introduce();
		joe.makePayment();
		
		
		Executive john  = new Executive("John", "Smith");
		john.setAge(40);
		john.setAddress(add);
		john.setIdNumber(129493);
		john.introduce();
		john.setYearlyBonus(23);
		john.setYearlySalary(21231);
		john.introduce();
		john.computePay();
		
		Executive johann  = new Executive("Johann", "Smith");
		john.setAge(42);
		john.setAddress(add);
		john.setIdNumber(43333);
		john.introduce();
		john.setYearlyBonus(22);
		john.setYearlySalary(12343);
		john.introduce();
		john.computePay();
		
		//FullTimeHourlyEmployee = new
		
		
		
		
	}

}
