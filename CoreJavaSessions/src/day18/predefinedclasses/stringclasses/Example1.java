package day18.predefinedclasses.stringclasses;
/**
 * Immutable Class: its value can't be changed, if you change new object will be created
 * 1. class and data variable should be declared as final
 * 2. constructor should be parameterized, to initialize final data variable
 * 3. use only getter method to get final variables value
 */

final class MyImmutableClass{
	final int age;
	final String name;
	MyImmutableClass(int age,String name){
		this.age=age;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}
public class Example1 {

	public static void main(String[] args) {
		
		MyImmutableClass m1=new MyImmutableClass(25,"Ram");
		System.out.println("age: "+m1.getAge());
		System.out.println("name: "+m1.getName());
//		m1.age=25;
//		m1.name="Bharat";
		
		MyImmutableClass m2=new MyImmutableClass(30,"Bharat");
		System.out.println("age: "+m1.getAge());
		System.out.println("name: "+m1.getName());
	}

}
