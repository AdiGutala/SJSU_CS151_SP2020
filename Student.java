import java.util.ArrayList;

public class Student {
	private String firstName;
	private String lastName;
	private int age;
	private float gpa;
	private String department;
	private String major;
	
	
	
	public Student(String f, String l, int a, float g, String d, String m) {
		firstName = f;
		lastName = l;
		age = a;
		gpa = g;
		department = d;
		major = m;
	}
	
	
	public class Course {
		
		ArrayList<String> schedule = new ArrayList<String>();
		
		public void createSchedule() {
			schedule.add("CS 146");
			schedule.add("CS 151");
			schedule.add("CS 147");
			schedule.add("CS 47");
		}
		
		
		
		public void printSchedule() {
			for(int i = 0; i<schedule.size(); i++) {
				System.out.println(schedule.get(i));
			}
		}
		
		
	}
		
	
	
}
