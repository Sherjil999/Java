
public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	@Override
	public void eat() {
		System.out.println(super.name + " is eating.");
		
	}

	@Override
	public void breathe() {
		System.out.println(super.name + " is breathing.");
		
	}
	
}
