
public class SalariedEmployee extends Employee {

	private double yearlySalary;
	private double yearlyBonus;
	
	public SalariedEmployee(String first, String last) {
		super(first, last);
		// TODO Auto-generated constructor stub
	}
	
	public SalariedEmployee(String first, String last, Address add) {
		super(first, last, add);
	}

	public float getYearlySalary() {
		return (float) yearlySalary;
	}

	public void setYearlySalary(float yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	public float getYearlyBonus() {
		return (float) yearlyBonus;
	}

	public void setYearlyBonus(float yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}
	
	

}
