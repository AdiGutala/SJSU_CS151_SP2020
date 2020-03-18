
public class EmployeeTest {

	public static void main(String[] args) {
		Employee jSmith = new Employee("John", "Smith",101, 35);
		jSmith.computePay(40);
		jSmith.computePay(23);
		jSmith.computePay(1);
		jSmith.computePay(0);
		jSmith.computePay(-5);
		jSmith.computePay(45);
	}

}
