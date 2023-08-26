package constructor;

public class ConstructorExample {
	
	public void info() {
		System.out.println("Name " +this.name);
		System.out.println("Roll No " + this.rollno);
	}

	ConstructorExample(){
		System.out.println("Non Parameter constructor");
	}
	
	String name;
	int rollno;
	
	ConstructorExample(String name,int rollno){
		this.name = name;
		this.rollno = rollno;
		System.out.println("Parameter constructor");
	}
	
	ConstructorExample(ConstructorExample ce2){
		this.name =ce2.name;
		this.rollno = ce2.rollno;
		System.out.println("Constructor overloading");
		
	}
	
	public static void main(String[] args) {
		// Constructor example 
		
		ConstructorExample ce =new ConstructorExample();
		
		ConstructorExample ce1 = new ConstructorExample("Krunal",202);
		ce1.info();
		
		ConstructorExample ce2 = new ConstructorExample(ce1);
		ce2.info();
		

	}

}
