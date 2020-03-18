
public class Course {
	private String courseName;
	private String courseDescription;
	private String department;
	private String startTime;
	private String weekday;
	
	
	public Course(String cN, String cd, String d, String sT, String w) {
		courseName = cN;
		courseDescription = cd;
		department = d;
		startTime = sT;
		weekday = w;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getWeekday() {
		return weekday;
	}
	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}
	
	
}
