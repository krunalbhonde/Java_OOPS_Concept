package polymophism;

public class compileTime {

	public static void main(String[] args) {
		CompileTimeExp ce = new CompileTimeExp();
		ce.name ="Krunal";
		ce.age = 28;
		ce.studenInfo(ce.name);
		ce.studenInfo(ce.age);
		ce.studenInfo(ce.name, ce.age);

	}

}
