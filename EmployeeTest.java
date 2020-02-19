
public class EmployeeTest {

	public static void main(String[] args) {
		Employee joe = new Employee ("Joe", "Smith", 30, 1234567, "962 Sunbonnet Loop" , "male", (float) 160, 121,"contractor", "09/19/2000");
		joe.calculatePay(60, 30);
		joe.introduce();
		System.out.println();
		
		Employee lisa = new Employee ("Lisa", "Gray", 30, 1234567, "962 Sunbonnet Loop" , "female", (float) 160, 122,"full-time", "09/19/2000");
		lisa.calculatePay(110000, 2);
		lisa.introduce();
		System.out.println();
		
		Employee tim = new Employee ("Timothy", "Briggs", 30, 1234567, "962 Sunbonnet Loop" , "male", (float) 160, 124,"full-time", "09/19/2000");
		tim.calculatePay(800000, 4);
		tim.introduce();
		System.out.println();
		
		Employee george = new Employee ("George", "Wallace", 30, 1234567, "962 Sunbonnet Loop" , "male", (float) 160, 128,"part-time", "09/19/2000");
		joe.calculatePay(20, 25);
		joe.introduce();
		System.out.println();
		
		Employee amy = new Employee ("Amy", "Student", 30, 1234567, "962 Sunbonnet Loop" , "male", (float) 160, 16,"contractor", "09/19/2000");
		amy.calculatePay(45, 45);
		amy.introduce();
		System.out.println();
		
	
		
		
		
	}

}
