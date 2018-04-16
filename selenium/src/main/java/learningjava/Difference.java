package learningjava;

public class Difference {

	public static void main(String[] args) {
		displayStatic();  //calling without object
		Difference t = new Difference();
		t.displayNonStatic();  //calling using object
	}

	static void displayStatic() {
		System.out.println("Hello World");
	}

	void displayNonStatic(){
		System.out.println("Hi Java");

	}

}
