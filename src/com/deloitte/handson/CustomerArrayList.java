package com.deloitte.handson;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomerArrayList {
	public static void main(String[] args) {
		ArrayList<Customer> c1 = new ArrayList<Customer>();
		c1.add(new Customer("Rishabh","919892643" , "kanpur",5,"Sports"));
		c1.add(new Customer("Rohit","91654656" , "gurugram",5,"food"));
		c1.add(new Customer("Rohit","91654656" , "gurugram",8,"food"));
		c1.add(new Customer("Prashant","919892643" , "kanpur",25,"household"));
		c1.add(new Customer("Rohit","919892643" , "kanpur",30,"Stationary"));
		c1.add(new Customer("Roshan","919892643" , "kanpur",6,"grocery"));
		
		Iterator<Customer> it = c1.iterator();
		Iterator<Customer>it2 = c1.iterator();
		Iterator<Customer> it3 = c1.iterator();
		int countA=0;
		int countB=0;
		int countC=0;
		while(it.hasNext()) {
			
			if(it.next().getTotalOrder()<10) {
				countA++;
			}
		}
		while(it2.hasNext()) {
			if(it2.next().getTotalOrder()>=20) {
				countB++;
			}
		}
		while(it3.hasNext()) {

			if(it3.next().getName()=="Rohit") {
				countC++;
			}
		}
			

		System.out.println("people getting 10% discount" + countA);
		System.out.println("Order more than 20 :- "+countB);
		System.out.println("people having same name As Rohit"+countC);
	}
}
