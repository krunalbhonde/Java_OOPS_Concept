package abstraction;

public abstract class Animal {
	 
	abstract void walk();
	void breath() {
		System.out.println("animal breathes air");
	}
	Animal(){
		System.out.println("This all about animal");
	}

}
