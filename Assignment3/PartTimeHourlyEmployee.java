
public class PartTimeHourlyEmployee extends HourlyEmployee {

	public PartTimeHourlyEmployee(String first, String last) {
		super(first, last);
		// TODO Auto-generated constructor stub
	}
	
	public PartTimeHourlyEmployee(String first, String last, Address address) {
		super(first, last, address);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return getFirstName() + " " + getLastName() + " " + getSsn() + " " + getIdNumber() + " " +
	getEducation() + " " + getAddress() + " " + getHourlyPay() + " " + getOtPay();
	}
	
	public void introduce() {
		System.out.println(this.toString());
	}
	
	public double computePay(int hours) {
		if (hours>40) {
			return -1;
		}
		return (this.getHourlyPay() * hours);
	}
	
}
