package presentation3;

//Parent class
class Shape {
	void area() {
		System.out.println("Shape: Generic area calculation");
	}
}

//Child class 1
class Rectangle extends Shape {
	int length = 5;
	int width = 4;

	@Override
	void area() {
		System.out.println("Rectangle: Area = " + (length * width));
	}
}

//Child class 2
class Circle extends Shape {
	int radius = 3;

	@Override
	void area() {
		System.out.println("Circle: Area = " + (3.14 * radius * radius));
	}
}

//Main class
public class Overriding_26 {
	public static void main(String[] args) {
		// Parent reference pointing to Rectangle object
		Shape s1 = new Rectangle();
		s1.area(); // Output: Rectangle: Area = 20

		// Parent reference pointing to Circle object
		Shape s2 = new Circle();
		s2.area(); // Output: Circle: Area = 28.26
	}
}