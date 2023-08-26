package encapsulation;

public class EncapRun {

	public static void main(String[] args) {
		EncapText encap = new EncapText();
		encap.setName("Krunal");
		encap.setId("11sf");
		encap.setage(28);

		System.out.println("Name " + encap.getName());
		System.out.println("Id " + encap.getId());
		System.out.println("Age " + encap.getAge());
	}

}
