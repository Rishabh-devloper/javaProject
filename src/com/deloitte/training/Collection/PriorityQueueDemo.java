package com.deloitte.training.Collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo  {
public static void main(String[] args) {
	StudentComparatorByName_asc comp = new StudentComparatorByName_asc();
	PriorityQueue<Student> pq= new PriorityQueue<Student>(comp);
	
	
	
	pq.offer(new Student("ris" , 21));
	pq.offer(new Student("rishabh" , 20));
	pq.offer(new Student("rishabh" , 18));
	pq.offer(new Student("aman" , 22));
	pq.offer(new Student("prashant" , 25));
	System.out.println(pq);
	
}




}
