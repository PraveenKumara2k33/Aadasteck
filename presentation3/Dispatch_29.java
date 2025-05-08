package presentation3;

class A7 {
	void callme() {
		System.out.println("Inside A7's callme method");
	}
}

class B7 extends A7 {
	void callme() {
		System.out.println("Inside B7's callme method");
	}
}

public class Dispatch_29 {
	public static void main(String args[]) {
		A7 a = new A7();
		B7 b = new B7();

		A7 r;
		r = a;
		r.callme();
		r = b;
		r.callme();
	}
}