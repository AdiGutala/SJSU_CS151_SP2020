import java.util.*;

public class PersonTest {

	public static void main(String[] args) {
		ArrayList<Person> roster = new ArrayList<Person>();
		roster.add(new Person("Joe", "Smith", 40));
		roster.add(new Person("Amy", "Gold", 32));
		roster.add(new Person("Tony", "Stork", 21));
		roster.add(new Person("Sean", "Irish", 24));
		roster.add(new Person("Tina", "Brock", 28));
		roster.add(new Person("Lenny", "Help", 18));
	}
	
	public static void sort(ArrayList<Person> pList, String attribute, boolean ascending) {
		if(attribute.equals("firstName")) {
		if(ascending) {
			pList.sort(Comparator.comparing(Person:: getFirstName));
		}
		else {
			pList.sort(Comparator.comparing(Person:: getFirstName).reversed());
		}
		
		}
		
		else if(attribute.equals("lastName")) {
			if(ascending) {
				pList.sort(Comparator.comparing(Person:: getLastNameLength));
			}
			else {
				pList.sort(Comparator.comparing(Person:: getLastNameLength).reversed());
			}
		}
		
		else if(attribute.equals("age")) {
			if(ascending) {
				pList.sort(Comparator.comparing(Person:: getAge));
			}
			else {
				pList.sort(Comparator.comparing(Person:: getAge).reversed());
			}
		}
	}

}
