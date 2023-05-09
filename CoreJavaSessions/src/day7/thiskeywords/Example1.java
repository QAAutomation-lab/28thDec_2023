package day7.thiskeywords;
class Example1 {	
	Example1(){
		this(10);
		System.out.println("I am zero-param cons");
	}
	Example1(int i){
		this(5,'q');
		System.out.println("I am int-param cons");
	}
	Example1(double d){
		System.out.println("I am double-param cons");
	}
	Example1(int a,char b){
		this(3.56);
		System.out.println("I am int-char param cons");
	}
	public static void main(String args[]) {	
//		Example1 e1=new Example1();
//		Example1 e2=new Example1(25);
//		Example1 e3=new Example1(45.56);
//		Example1 e4=new Example1(25,'A');
		
		Example1 e1=new Example1();
	}
}
/*
 * this() - this statement
 * 		is use to call another constructor of current class based on the parameter
 * 		it should used only inside constructor body and should be the first statement inside constructor
 */


