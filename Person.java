
public class Person {
	private String firstName;
	
	
	private String lastName;
	private int age;
	private int ssn;
	private String address;
	private String gender;
	private float weight;
	
	public Person(String f, String l, int a, int s, String ad, String g, float w) {
		firstName = f;
		lastName = l;
		age = a;
		ssn = s;
		address = ad;
		gender = g;
		weight = w;
	}
	
	public void introduce() {
		System.out.println(firstName + " " + lastName + " " + age + " " + ssn + " " + 
				address + " " + gender + " " + weight);
		
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	
	
	
	
	
	
}
