
public class FullTimeSalaried extends SalariedEmployee {

	public FullTimeSalaried(String first, String last) {
		super(first, last);
		// TODO Auto-generated constructor stub
	}
	
	public FullTimeSalaried(String first, String last, Address address) {
		super(first, last, address);
	}
	
	public String toString() {
		return getFirstName() + " " + getLastName() + " " + getSsn() + " " + getIdNumber() + " " +
	getEducation() + " " + getAddress() + " " + getYearlySalary() + " " + getYearlyBonus();
	}
	
	public void introduce() {
		System.out.println(this.toString());
	}
	
	public float computePay(int weeks) {
		return (this.getYearlySalary() * (weeks/52));
	}
	

	
	
	
}
