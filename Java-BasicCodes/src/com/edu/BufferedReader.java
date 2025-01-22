package com.edu;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class BufferedReader {


	public static void main(String[] args) throws IOException {
		int age;
		String name;
		float salary;
		char gen;
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		//BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name");
		name = bufferedReader.readLine(); //String
		
		System.out.println("enter age");
		age =Integer.parseInt(bufferedReader.readLine()); //"34"
		
		System.out.println("enter salary ");
		salary = Float.parseFloat(bufferedReader.readLine());
		
		System.out.println("enter gender");
		//gen = bufferedReader.readLine().charAt(0);
		gen = (char)bufferedReader.read();
		
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Salary="+salary);
		System.out.println("gen="+gen);
		
	}


}

