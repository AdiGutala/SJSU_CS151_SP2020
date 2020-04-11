
public class Course {
	private String courseName;
	private String courseDesc;
	private String department;
	private String startTime;
	private String weekDay;
	
	
	
	public Course(String courseName, String courseDesc, String department, String startTime, String weekDay) {
		this.courseName = courseName;
		this.courseDesc = courseDesc;
		this.department = department;
		this.startTime = startTime;
		this.weekDay = weekDay;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDesc() {
		return courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
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
	public String getWeekDay() {
		return weekDay;
	}
	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}
	
	
}
