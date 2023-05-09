package day3.variabletypes;

public class Variable1 {

	//global variables - variable declared outside method body but present inside class body known as Global Variable
	static int age=25;//static global variable
	double salary=95000;//non-static global variable
	
	public static void main(String[] args) {
		//local variable- variable declared inside method/constructor/block body known as local variable, we don;t use static keyword with local variable
		int x,y,res;
		x=10;
		y=25;
		res =x+y;

	}
}
/*
 * Local variable: variable declared inside method/constructor/block body known as local variable, 
 * 					we don;t use static keyword with local variable
 * 					These variable won't get separate memory for storage
 * 					these variable are not accessible from outside the method/constructor body
 * Global Variable: variable declared outside the method/constructor body but present in class body
 * 					known as global variable
 * 		type:
 * 			static global variable: 
 * 			non-static global variable:
 */
