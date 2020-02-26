



public class Executive extends SalariedEmployee {

	public Executive(String first, String last) {
		super(first, last);
		// TODO Auto-generated constructor stub
	}
	
	public Executive(String first, String last, Address ad) {
		super(first, last, ad);
	}
	
	public String toString() {
		return getFirstName() + " " + getLastName() + " " + getSsn() + " " + getIdNumber() + " " +
	getEducation() + " " + getAddress() + " " + getYearlySalary() + " " + getYearlyBonus();
	}
	
	public void introduce() {
		System.out.println(this.toString());
	}
	
	public float computePay() {
		return getYearlySalary() + getYearlyBonus();
	}
	
}
