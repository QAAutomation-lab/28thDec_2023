package day18.predefinedclasses.stringclasses;

public class StringDemo {

	public static void main(String[] args) {
		StringDemo s1=new StringDemo();
		System.out.println("s1: "+s1);//
		
		String str1="Bangalore";
		System.out.println("char count in String: "+str1.length());
		System.out.println("char at index 0: "+str1.charAt(0));
		System.out.println("char at index 0: "+str1.charAt(3));
		System.out.println("char at index 0: "+str1.charAt(5));
		System.out.println("char at index 0: "+str1.charAt(7));
		System.out.println("***************************");
		for(int i=0;i<str1.length();i++){
			System.out.println("char at index "+i+": "+str1.charAt(i));
		}
		System.out.println("Str1: "+str1);
		String str2="Bangalore";//no object creation
		System.out.println("Str2: "+str2);
		System.out.println("Comparing str1 and str2 with equals(): "+str1.equals(str2));
		System.out.println("Comparing str1 and str2 with ==: "+(str1==str2));
		
		String str3="Mumbai";
		System.out.println("Str3: "+str3);
		System.out.println("Comparing str1 and str3 with equals(): "+str1.equals(str3));
		System.out.println("Comparing str1 and str3 with ==: "+(str1==str3));
		
		String str4=new String("Pune");// two objects will be created
		System.out.println("Str4: "+str4);
		System.out.println("Comparing str1 and str4 with equals(): "+str1.equals(str4));
		System.out.println("Comparing str1 and str4 with ==: "+(str1==str4));
		
		String str5=new String("Pune");
		System.out.println("Str5: "+str5);
		System.out.println("Comparing str4 and str5 with equals(): "+str4.equals(str5));
		System.out.println("Comparing str4 and str5 with ==: "+(str4==str5));
		
		String str6="Pune";
		System.out.println("Str6: "+str6);
		System.out.println("Comparing str4 and str6 with equals(): "+str4.equals(str6));
		System.out.println("Comparing str4 and str6 with ==: "+(str4==str6));
	}

}
/**
String-->	
		predefined class in java belongs to java.lang package 
		it represents group/collection of characters
		In String class following methods are overrided
				1. toString() --> instead of printing string representation of object it will print value stored 
								  inside the string object
				2. equals()   ---> overrided, it compare two objects based on there value
				3. ==         ---> overrided, it compares two objects based on there address
		We can create String class object in two ways
			1. by using new keyword
						---> object will be stored in non constant pool
						---> by using this we can have duplicate object also
			2. by using literal 
						---> object will be stored in String constant pool(inside heap)
						---> by using this we can create only unique object inside the pool
*/
