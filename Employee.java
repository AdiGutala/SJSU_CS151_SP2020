
public class Employee extends Person {
	
	private int employeeID;
	

	private String employeeStatus;
	private String startDate;
	private double hourlyPay;
	private double yearlySalary;
	
	public Employee(String f, String l, int a, int s, String ad, String g, float w, int id, String stat, String sd) {
		super(f, l, a, s, ad, g, w);
		employeeID = id;
		employeeStatus = stat;
		sd = startDate;
	}



	public void calculatePay(int pay, int time)  {
		if(employeeStatus.equals("contractor") || employeeStatus.equals("part-time")) {
			hourlyPay = (double) time * pay;
		}
		else {
			yearlySalary = (double) time * pay;
		}
	}
	
	public void introduce() {
		super.introduce();
		System.out.println(employeeID + " " + employeeStatus + " " + startDate + " " + hourlyPay + " " + yearlySalary);
	}
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(String employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}


	public double getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
	

}
