package polymophism;

public class CompileTimeExp {

	String name;
	int age;
	public void studenInfo(String name) {
		System.out.println(this.name);
	}
	public void studenInfo(int age) {
		System.out.println(this.age);
	}
	public void studenInfo(String name,int age) {
		System.out.println(this.name + ": " + this.age);
	}
	
	
}
