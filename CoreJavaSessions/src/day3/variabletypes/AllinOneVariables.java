package day3.variabletypes;

public class AllinOneVariables {

	//global variable
	static int empId=10;//static global variable
	double salary;//non-static global variable
	public static void main(String[] args) {
		System.out.println("Programs starts");
		//local variables
		int age=25;
		//access local variable and also update its value
		System.out.println("Local variable age :"+age);
		age=50;
		System.out.println("Updated local variable age:"+age);
		//access static global variable and also update its value
		System.out.println("Static global variable empId:"+AllinOneVariables.empId);
		AllinOneVariables.empId=20;
		System.out.println("updated, Static global variable empId:"+AllinOneVariables.empId);
		//access non-static global variable and also update its value
		AllinOneVariables ref=new AllinOneVariables();
		System.out.println("Non-Static global variable salary:"+ref.salary);
		ref.salary=5400.56;
		System.out.println("updated,Non-Static global variable salary:"+ref.salary);
		
		AllinOneVariables ref1=new AllinOneVariables();
		System.out.println("Non-Static global variable salary:"+ref1.salary);
		System.out.println("Programs ends");		
	}
}
/*
 * diff: local vs global variable
 * what is class?
 * what is variable?
 * types of variable
 * what is object?
 * why to create object?
 * what is datatype?
 * types of datatype?
 * syntax to compile and execute java program from cmd
 * how to create object?
 * syntax to declare variable?
 * keyword, identifier & literals
 * what is static global variable
 * what is non-static global variable
 */
