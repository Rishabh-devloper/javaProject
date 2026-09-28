package com.deloitte.handson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapHandson {
	public static void main(String[] args) {
		HashMap<String,String> hmap= new HashMap<String, String>();
		hmap.put("UserName1", "password1");
		hmap.put("UserName2", "password2");
		hmap.put("UserName3", "password3");
		hmap.put("UserName4", "password4");
		
		hmap.putIfAbsent("UserName5","pass5" );
		Set<Entry<String, String>> entry= hmap.entrySet();
		Iterator<Entry<String, String>> it = entry.iterator();
		ArrayList<String> username= new ArrayList<String>();
		ArrayList<String> password= new ArrayList<String>();
		
		while(it.hasNext()) {
			Entry<String,String> e= it.next();
			username.add(e.getKey());
			password.add(e.getValue().substring(e.getValue().length()-4));
		}
		hmap.remove(username.removeLast());
		
		System.out.println(hmap);
		
		System.out.println("List of the usernames = "+username);
		System.out.println("List of passwords="+ password);
		
	}
}
