
public abstract class Animal {
	String name;
	
	public Animal() {
		this.name = "Dingo";
	}
	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public abstract void eat();
	public abstract void breathe();
	
}
