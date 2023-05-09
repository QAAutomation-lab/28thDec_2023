package day18.predefinedclasses.scannerclass;

import java.util.Scanner;

public class Example1 {
	
	public static void main(String[] args) {
	 	
	 	Scanner scn=new Scanner(System.in);
	 	System.out.println("Enter array size:");
	 	int size=scn.nextInt();
	 	int num[]=new int[size];
	 	
	 	for(int i=0;i<num.length;i++) {
	 		System.out.println("Enter array element at index : "+i);
	 		num[i]=scn.nextInt();
	 	}
	 	
	 	for(int a:num) {
	 		System.out.println(a);
	 	}
	}
	
}
