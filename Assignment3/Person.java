
public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private int ssn;
	private int idNumber;
	private boolean accomodation;
	private Address address;
	
	public Person (String first, String last) {
		firstName = first;
		lastName = last;
	}

	public Person (String first, String last, Address add) {
		firstName = first;
		lastName = last;
		add = address;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public boolean isAccomodation() {
		return accomodation;
	}

	public void setAccomodation(boolean accomodation) {
		this.accomodation = accomodation;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address add) {
		this.address = add;
	}
	
	
	
}