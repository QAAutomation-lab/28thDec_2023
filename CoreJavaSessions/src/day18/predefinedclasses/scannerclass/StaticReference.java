package day18.predefinedclasses.scannerclass;

class Demo {
	void display() {
		System.out.println("Demo class display method");
	}

	void callMe(int num) {
		System.out.println("Demo class callMe method");//
	}

	Demo() {
		System.out.println("Demo class cons..");
	}
}

public final class StaticReference {

	static Demo d2 = new Demo();
	static int age=25;
	public static void main(String[] args) {
		// access Demo class non-static member
//		Demo d1 = new Demo();
//		d1.display();
//		d1.callMe(123);		
		
		//classname.staticref.method
		System.out.println(StaticReference.age);
		//classname.staticref.method
		StaticReference.d2.callMe(123);
		StaticReference.d2.display();
		
		System.err.println("I am error msg");

	}

}
