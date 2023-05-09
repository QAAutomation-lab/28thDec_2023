package day16.typecasting;
class Man{
	void canTalk() {
		System.out.println("Man can talk");
	}
}
class Boy extends Man{
	void canPlay() {
		System.out.println("Boy is playing");
	}
}
public class Example1 {

	public static void main(String[] args) {
	
		Man m1=new Boy();//Up casting---> implicit	
		m1.canTalk();
		Man m2=(Man)new Boy();//Up casting --> explicit
		
		//Boy b1 =  new Man();// Downcasting ---> implicit ---> not possible
		
		Boy b2=(Boy)m1;//downcasting ---> explicit ---> Boy b2=(Boy)m1 = new Boy();
		b2.canPlay();
		b2.canTalk();
	}
}
/*
converting one class object into another class type known as non-primitive/derived casting
	* Inheritance is mandatory
type: 
	1. Up casting ---> child class object is referred by parent class
					a. implicit or auto up casting
					b. explicit up casting
	2. down casting ---> parent class object is referred by child class
			NOTE: downcasting is not possible directly
			* Only upcasted object can be downcasted
*/