package com.edu;

import java.util.HashSet;

public class Hashsetdemo {
	public static void main(String[] args) {
		HashSet<Integer>hobj=new HashSet<Integer>();
		hobj.add(67);
		hobj.add(67);
		hobj.add(67);
		hobj.add(87);
		hobj.add(90);
		hobj.add(null);
		System.out.println(hobj);
		
	}

}
