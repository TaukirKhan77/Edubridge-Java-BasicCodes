package com.edu;

public class ConstructorChainingDemo {
	ConstructorChainingDemo()//4
	{
		this("Rena");
		System.out.println("Its a Default constructor");
		System.out.println("--------------------------------------------------");
	}
	ConstructorChainingDemo(String name)//3
	{
		this(10);
		System.out.println("Its string parameteraized constructor");
		System.out.println("Hello "+name);
		System.out.println("--------------------------------------------------");
	}
	ConstructorChainingDemo(int no)//2
	{
		this(1,"Seema");
		System.out.println("Its int is parametraize constructor");
		System.out.println("no : "+no);
		System.out.println("--------------------------------------------------");
	}
	ConstructorChainingDemo(int no,String name)//1
	{
		System.out.println("Its int and String parameteraized Constructor");
		System.out.println("no : "+no);
		System.out.println("Name : "+name);
		System.out.println("--------------------------------------------------");
	}
	public static void main(String[] args) {
		ConstructorChainingDemo demo=new ConstructorChainingDemo();
	}

}
