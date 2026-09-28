package com.deloitte.training.Collection;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("Rishabh");
		st.push("Ri");
		st.push("habh");
		st.push("Red");
		st.push("Blue");
		st.push("book");
		st.peek();
		
		
		System.out.println(st.peek());
		System.out.println(st.pop());
		}
}
