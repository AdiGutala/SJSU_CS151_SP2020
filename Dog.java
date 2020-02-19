
public class Dog extends Animal implements Domesticated {

	
	
	@Override
	public void walk() {
		System.out.println("walk");
		
	}

	@Override
	public void greetHuman() {
		System.out.println("greet");
	}
	
	public void bark() {
		System.out.println("bark");
	}
	
}
