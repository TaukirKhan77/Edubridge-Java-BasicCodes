package com.edu;
class Parent{ //parent class
	void print() throws Exception{
		System.out.println("Its a Parent Method");
	}
}
public class TestMethodOverringException extends Parent {// child 
	void print() throws Exception{
		System.out.println("Its a Child Method");
	}
public static void main(String[] args) {
	Parent p=new Parent();
	try {
		p.print();
	}catch(Exception e) {
		System.out.println(e);
	}
	TestMethodOverringException t= new TestMethodOverringException();
	try {
		t.print();
	}catch(Exception e) {
		System.out.println(e);
	}
		
	}
}
