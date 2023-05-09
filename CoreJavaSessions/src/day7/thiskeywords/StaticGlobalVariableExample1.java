package day7.thiskeywords;

public class StaticGlobalVariableExample1 {
	static int age=35;
	public static void main(String[] args) {
		int age=25;
		System.out.println("I am local age: "+age);
		System.out.println("I am global age: "+StaticGlobalVariableExample1.age);
	}
}
