package com.edu;

public class TestCustomException {
public static void main(String[] args) {
	try {
		int age=10;
		if(age<18) {
			throw new MyCustomException("InvalidAgeException");
		}
		// rest of code
		System.out.println("Write code here");
	}catch(MyCustomException e){
System.out.println(e);	
	}
}
}
