package com.edu;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class MapExample {
	public static void main(String[] args) {
		HashMap<Integer,String> hobj=new HashMap<Integer,String>();
		hobj.put(101,"Taukir");
		hobj.put(102,"Divya");
		hobj.put(103,"Pavan");
		hobj.put(12,"Dhananjay");
		hobj.put(106,"Sidhart");
		System.out.println(hobj);
		
		LinkedHashMap<Integer,String> hobj1=new LinkedHashMap<Integer,String>();
		hobj1.put(101,"Taukir");
		hobj1.put(102,"Divya");
		hobj1.put(13,"Pavan");
		hobj1.put(12,"Dhananjay");
		hobj1.put(106,"Sidhart");
		System.out.println(hobj1);
		
		TreeMap<Integer,String> hobj2=new TreeMap<Integer,String>();
		hobj2.put(101,"Taukir");
		hobj2.put(10,"Divya");
		hobj2.put(13,"Pavan");
		hobj2.put(12,"Dhananjay");
		hobj2.put(106,"Sidhart");
		System.out.println(hobj2);
		
		System.out.println("For THe Iteration Purpose");
		//Iteration
		for(Map.Entry<Integer,String>m:hobj2.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
	}

}
