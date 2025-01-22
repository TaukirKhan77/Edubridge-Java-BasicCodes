package com.edu;

public class TestExceptionPropagation {
	void firstMethod() {
		int no=30/0;
	}
	void secondMethod() {
		firstMethod();
	}
	void thirdMethod() {
		try {
			secondMethod();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		TestExceptionPropagation tep=new TestExceptionPropagation();
		tep.thirdMethod();
		System.out.println("Rest of the code of terminal flow");
	}

}
