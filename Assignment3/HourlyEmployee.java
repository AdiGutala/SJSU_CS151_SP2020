
public class HourlyEmployee extends Employee {
	
	
	private double hourlyPay;
	private double otPay;  

	public HourlyEmployee(String first, String last, Address add) {
		super(first, last, add);
		// TODO Auto-generated constructor stub
	}
	
	public HourlyEmployee(String first, String last) {
		super(first, last);
		// TODO Auto-generated constructor stub
	}

	public double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	public double getOtPay() {
		return otPay;
	}

	public void setOtPay(double otPay) {
		this.otPay = otPay;
	}
	
	
	
	
}
