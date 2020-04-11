import java.util.*;

public class Student {
	private String firstName;
	private String lastName;
	private int age;
	private float gpa;
	private String department;
	private ArrayList<Course> courses;
	
	public Student(String firstName, String lastName, int age, float gpa, String department, ArrayList<Course> courses) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.department = department;
		this.courses = courses;
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
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public ArrayList<Course> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	public void addCourse(Course c) {
		courses.add(c);
	}
	
	public void removeCourse(Course c) {
		courses.remove(c);
	}
	
	public void sortCourses(boolean ascending, String attribute) {
		
		if(attribute.equals("courseName")) {
			if(ascending)
			courses.sort(Comparator.comparing(Course::getCourseName));
			else
			courses.sort(Comparator.comparing(Course::getCourseName).reversed());
		}
		
		else if(attribute.equals("courseDesc")) {
			if(ascending)
				courses.sort(Comparator.comparing(Course::getCourseDesc));
				else
				courses.sort(Comparator.comparing(Course::getCourseDesc).reversed());
		}
		else if (attribute.equals("department")) {
			if(ascending) {
				courses.sort(Comparator.comparing(Course::getDepartment));
			}
			else {
				courses.sort(Comparator.comparing(Course::getDepartment).reversed());
			}
		}
		else if(attribute.equals("startTime")) {
			if(ascending) {
				courses.sort(Comparator.comparing(Course::getStartTime));
			}
			else {
				courses.sort(Comparator.comparing(Course::getStartTime).reversed());
			}
		}
		else if(attribute.equals("weekDay")) {
			if(ascending) {
				courses.sort(Comparator.comparing(Course::getWeekDay));
			}
			else {
				courses.sort(Comparator.comparing(Course::getWeekDay).reversed());
			}
		}
		
		for(Course course: courses) {
			System.out.println(course.getCourseName());
		}
	}
	
	
}
