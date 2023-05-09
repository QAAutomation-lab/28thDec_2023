package day11.inheritances;
class Country{
	//default constructor
	void display() {
		System.out.println("I am display method of Country");
	}
}
class State extends Country{
	//default constructor with default super()
	void calling() {
		System.out.println("I am calling method of State");
	}
}
public class Example1 {

	public static void main(String[] args) {
		State s1=new State();
		s1.display();
		s1.calling();
	}
}
/**
in order to achieve inheritance we need constructor chaining-

constructor chaining- when subclass constructor calls super class constructor and 
						super class constructor calls its super class constructor dn its 
						known as constructor chaining
to achieve constructor chaining we need to user super().

super() is used to call parent class constructor based on parameter
super() should be the first statement inside the constructor body
*/