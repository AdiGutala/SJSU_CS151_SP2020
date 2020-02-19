
public class StudentTest {
	
	public static void main(String[] args) {
		Student johnSmith = new Student("John", "Smith", 20, (float) 3.6,
				"School of Computer Science", "Computer Science");
		
		Student.Course course = johnSmith.new Course();
		course.printSchedule();
	}
	
	
	
}
