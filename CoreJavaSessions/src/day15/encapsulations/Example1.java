package day15.encapsulations;
class Encap{
	private int pinCode=4110;
	private double salary=45000;
	private char grade='A';
	/*implement getter method to access these private data members from outside the class
	 * to write getter method, create a public method with return type as private variable datatype
	 */
	public int getPinCode() {
		return pinCode;
	}
	public double getSalary() {
		return salary;
	}
	public char getGrade() {
		return grade;
	}	
	/* setter method will help you to access private data members from outside the class
	 * create a public method with void as return type and argument should match with you private variable datatype
	 */
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
}
public class Example1 {

	public static void main(String[] args) {
		Encap e1=new Encap();
		//as Encap class data members are declared as private, hence we are not allowed to access them from outside the class
//		System.out.println(e1.pinCode);
//		System.out.println(e1.salary);
//		System.out.println(e1.grade);
		
		System.out.println(e1.getPinCode());
		System.out.println(e1.getSalary());
		System.out.println(e1.getGrade());
		System.out.println("*************For e1 object, update values for private variables*********************");
		e1.setPinCode(123);
		e1.setSalary(545565.56);
		e1.setGrade('B');
		System.out.println(e1.getPinCode());
		System.out.println(e1.getSalary());
		System.out.println(e1.getGrade());
		System.out.println("####################New OBject#####################");
		Encap e2=new Encap();
		System.out.println(e2.getPinCode());
		System.out.println(e2.getSalary());
		System.out.println(e2.getGrade());
	}
}
