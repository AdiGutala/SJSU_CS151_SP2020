
public class Student {


		private String firstName;
		private String lastName;
		private int age;
		private float gpa;
		private String major;
		private String Department;
		
		private Course cs151 = new Course("CS 151", "Object Oriented Design", "CS", "6:00pm", "Tue");
		private Course cs146 = new Course("CS 146", "Data Structures and Algorithms","CS","10:30am", "Wednesday");
		private Course math129a = new Course("Math 129a", "Linear Algebra 1", "Math", "4;30pm", "Thursday");
		private Course math161a = new Course("Math 161a", "Probability and Statistics","Math", "3:00pm", "Monday");
		
		
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
		public String getMajor() {
			return major;
		}
		public void setMajor(String major) {
			this.major = major;
		}
		public String getDepartment() {
			return Department;
		}
		public void setDepartment(String department) {
			Department = department;
		}
		public Course getCs151() {
			return cs151;
		}
		public void setCs151(Course cs151) {
			this.cs151 = cs151;
		}
		public Course getCs146() {
			return cs146;
		}
		public void setCs146(Course cs146) {
			this.cs146 = cs146;
		}
		public Course getMath129a() {
			return math129a;
		}
		public void setMath129a(Course math129a) {
			this.math129a = math129a;
		}
		public Course getMath161a() {
			return math161a;
		}
		public void setMath161a(Course math161a) {
			this.math161a = math161a;
		}
		
		
}
