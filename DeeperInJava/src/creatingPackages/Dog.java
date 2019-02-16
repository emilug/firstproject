package creatingPackages;

public class Dog {

	String name;
	String color;

	public Dog() {
		System.out.println("Constructing a Dog");
		// name = "Grivei";
		// color = "Alb";
	}

	public static void main(String[] args) {
		Dog x = new Dog();
		x.name = "Grivei";
		x.color = "Alb";
		System.out.println(x.name);
		System.out.println(x.color);

		Dog y = new Dog();
		y.name = "Rex";
		y.color = "Negru";
		System.out.println(y.name);
		System.out.println(y.color);

	}

}
