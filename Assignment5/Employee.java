
import java.lang.NumberFormatException;;

public class Employee {
	private String firstName;
	private String lastName;
	private int employeeID;
	private int hourlyPay;
	
	public Employee(String fN, String lN, int eID, int hP) {
		firstName = fN;
		lastName = lN;
		employeeID = eID;
		hourlyPay = hP;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public int getHourlyPay() {
		return hourlyPay;
	}
	public void setHourlyPay(int hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	
	public float computePay(int hours) {
		if(hours<0) {
			throw new NumberFormatException("hours cannot be a negative number");
		}
		else if(hours>40) {
			throw new TooManyHoursWorkedException("You cannot work more than 40 hours");
		}
		else {
			return (float) (hours * hourlyPay);
		}
	}
	
	public class TooManyHoursWorkedException extends NumberFormatException {
		public TooManyHoursWorkedException(String message) {
			super(message);
		}
	}
	
	
}
