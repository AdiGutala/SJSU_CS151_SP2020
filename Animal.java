
public class Animal {
	private String type;
	private String name;
	private int age;
	private String gender;
	private String environment;
	private int speed;
	
	
	
	public Animal() {
		type = "";
		name = "";
		age = 0;
		gender = "";
		environment = "";
		speed = 0;
	}
	
	
	public Animal (String t, String n, int a, String g, String e, int s) {
		type = t;
		name = n;
		age = a;
		gender = g;
		environment = e;
		speed = s;
	}
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	public void move() {
		System.out.println("move");
	}
	
	public void sound() {
		System.out.println("sound");
	}
	
	public void eat() {
		System.out.println("eat");
	}
	
	public void sleep() {
		System.out.println("sleep");
	}
	
	public String toString() {
		return type + " " + " " + name + " " + " " + age + " " + gender + " " + environment + " " + speed;
	}
	
	
	
}


