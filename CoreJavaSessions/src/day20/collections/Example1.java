package day20.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		//ArrayList l1=new ArrayList();
				//or
		List l1=new ArrayList();
		l1.add("Pune");//String to Object class object - Auto upcasting
		l1.add(123);//int to Integer object(Auto boxing) and dn Integer to Object class(Auto upcasting)
		l1.add("Apple");
		l1.add("Pune");
		l1.add(null);
		System.out.println("Get element present in index 0: "+l1.get(0));
		System.out.println("Elements count in list: "+l1.size());
		System.out.println("Elements in list: "+l1);
		l1.add(1, "Java");
		System.out.println("Updated, Elements in list: "+l1);
		l1.set(4, "Champak");
		System.out.println("Updated2, Elements in list: "+l1);
		System.out.println("*****Print elements one by one using for loop*****");
		for(int i=0;i<l1.size();i++) {
			System.out.println("Element at index "+i+": "+l1.get(i));
		}
		System.out.println("*****Print elements one by one using for-each loop*****");
		for(Object obj:l1) {
			System.out.println(obj);
		}
		System.out.println("*****Print elements one by one using Iterator interface*****");
		Iterator itr=l1.iterator();
		/**
		 * Iterator is an interface use to iterate collection elements one by one
		 * hasNext()--> checks only element existence --> true/false
		 * next()   --> get the element from the collection
		 * remove() --> remove the element from the collection
		 */
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());//java.util.NoSuchElementException
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*****trying iterate collection using used Iterator object********");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*****trying iterate collection using new Iterator object********");
		Iterator itr2=l1.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("List1 elements are: "+l1);
		List l2=new ArrayList();
		l2.add("Windows 10");
		l2.add("Windows 11");
		l2.add(123);
		l2.add("Linux");
		System.out.println("List2 elements are: "+l2);
		System.out.println("******* Adding l1 all elements into l2 **********");
		l2.addAll(1,l1);
		System.out.println("List2 element after adding list1 elements: "+l2);
	}
}
