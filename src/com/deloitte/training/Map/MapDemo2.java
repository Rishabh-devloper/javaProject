package com.deloitte.training.Map;



import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;



import java.util.Set;
import java.util.TreeMap;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<Integer, Employee> hmap= new TreeMap<Integer, Employee>(Comparator.reverseOrder());
		
		hmap.put(5, new Employee(1,"Ballu","BPO" , 25000,2,"Noida"));
		
		hmap.put(2, new Employee(2,"Rishabh","IT" , 50000,6,"Bengluru"));
		
//		hmap.put(null,new Employee(6,"Sagar","IT" , 90000 ,4,"Bengluru"));
		
		hmap.put(1, new Employee(7 , "Shreya","BPharam",80000,6,"kanpur"));
		System.out.println(hmap);
		Set<Entry<Integer, Employee>> entrySet = hmap.entrySet();
		 Iterator<Entry<Integer, Employee>> it = entrySet.iterator();
		 while(it.hasNext()) {
			 Entry<Integer, Employee> e = it.next();
//			 System.out.println(e.getValue().getName());
			 if(e.getValue().getSalary()>30000) {
				 System.out.println("employee salary more thn 30K:- " + e.getValue().getName());
			 }
		 }
		
	}
}
