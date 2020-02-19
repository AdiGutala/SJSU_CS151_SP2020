
public class Cat extends Animal implements Domesticated {

	@Override
	public void walk() {
		System.out.println("walk");
	}

	@Override
	public void greetHuman() {
		System.out.println("greet");
		
	}
	
	public void scratch() {
		System.out.println("scratch");
	}

}
