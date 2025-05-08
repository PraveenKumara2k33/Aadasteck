package presentation3;

//Abstract class
abstract class Shape1 {
	abstract void draw(); // abstract method

	public void display() {
		System.out.println("This is a shape");
	}
}

//Concrete subclass
class Circle1 extends Shape1 {
	void draw() {
		System.out.println("Drawing a circle");
	}
}

class Rectangle1 extends Shape1 {
	void draw() {
		System.out.println("Drawing a rectangle");
	}
}

//Main class
public class Abstract_27 {
	public static void main(String[] args) {
		Shape1 s;

		s = new Circle1();
		s.draw(); // Output: Drawing a circle
		s.display(); // Output: This is a shape

		s = new Rectangle1();
		s.draw(); // Output: Drawing a rectangle
	}
}