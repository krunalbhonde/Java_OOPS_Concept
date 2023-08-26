package abstraction;

public class Horse extends Animal {

	Horse(){
		System.out.println("Created Horse animal");
	}
	@Override
	void walk() {
		System.out.println(" Horse Walk on 4 leg");
		
	}
	

}
