
public class Employee extends Person {
	private String education;
	
	public Employee(String first, String last) {
		super(first, last);
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String first, String last, Address add) {
		super(first, last, add);
	}

	public String getEducation() {
		return education;
	}
	
	public void setEducation(String ed) {
		education = ed;
	}
	

}
