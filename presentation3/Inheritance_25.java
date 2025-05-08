package presentation3;

//Superclass
class Animal {
	void eat() {
		System.out.println("This animal eats food");
	}
}

//Subclass
class Dog extends Animal {
	void bark() {
		System.out.println("The dog barks");
	}
}

public class Inheritance_25 {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.eat(); // Inherited from Animal
		myDog.bark(); // Defined in Dog
	}
}