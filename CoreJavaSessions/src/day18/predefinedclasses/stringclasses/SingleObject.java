package day18.predefinedclasses.stringclasses;

public class SingleObject {
	/**
	 * 1. constructor should be private
	 * 2. create static private ref variable of the class
	 * 3. create static method which return current class object
	 */
	private SingleObject(){
		System.out.println("SingleObject class constructor");
	}
	private static SingleObject s1=new SingleObject();
	public static SingleObject getInstance() {
		return s1;
	}
	int age=25;
	void calling()
	{
		System.out.println("I am calling ");
	}
}
class Demo{	
	public static void main(String[] args) {
		//SingleObject s1=new SingleObject();
		SingleObject obj=SingleObject.getInstance();
		System.out.println("age: "+obj.age);
		obj.calling();
		obj.age=35;
		System.out.println("age: "+obj.age);
		
		SingleObject obj2=SingleObject.getInstance();
		System.out.println("age: "+obj2.age);
		obj2.calling();
	}
}
