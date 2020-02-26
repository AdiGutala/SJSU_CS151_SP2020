
public class FullTimeHourlyEmployee extends HourlyEmployee {

	public FullTimeHourlyEmployee(String first, String last) {
		super(first, last);
		// TODO Auto-generated constructor stub
	}
	
	public FullTimeHourlyEmployee(String first, String last, Address address) {
		super(first, last, address);
		
	}
	
	public String toString() {
		return getFirstName() + " " + getLastName() + " " + getSsn() + " " + getIdNumber() + " " +
	getEducation() + " " + getAddress() + " " + getHourlyPay() + " " + getOtPay();
	}
	
	public void introduce() {
		System.out.println(this.toString());
	}
	
	public double computePay(int hours) {
		return (this.getHourlyPay() * hours) + this.getOtPay();
	}
	
	
	
	
	
	
	
}
