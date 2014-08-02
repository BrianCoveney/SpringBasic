package com.spring.tutorial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExample {
	
	public static void main(String [] args){
		
		
		//Maps
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		
		//System.out.println(map);
		
		//iterator
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		
		while(iter.hasNext()){
			String key = iter.next();
			String value = map.get(key);
			
			System.out.println("key is " +key+ " value is "+value);
		}
		
		
		
		//Set - No duplicate
		Set<Integer> integerSet = new HashSet<Integer>();
				
		integerSet.add(10);
		integerSet.add(10);
		integerSet.add(10);
		integerSet.add(10);
				
		System.out.println(integerSet);
		
		
		//List - allows duplicate
		List<Integer> integerList = new ArrayList<Integer>();
		
		integerList.add(10);
		integerList.add(10);
		integerList.add(10);
		integerList.add(10);
		
		System.out.println(integerList);
		
	}

}
