package com.edu;

public class NestedTryCatchDemo {
	void testNestedTry() {
		//outer
		try {
			//inner try 1
			try {
				System.out.println("divide by zero");
				int no=90/0;
			}
			//inner catch 1
			catch(ArithmeticException e){
				System.out.println(e);
			}
			//inner try 2
			try {
				System.out.println("ArrayIndexOutOfBound");
				int a[]=new int[5];
				a[10]=23;
			}
			//inner catch 2
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);	
			}
			System.out.println("Its a nestedtry demo");
		}
		catch(Exception e){
			System.out.println("Handled the exception");
		}
		System.out.println("Rest of the code");
		
	}
	public static void main(String[] args) {
		NestedTryCatchDemo nd=new NestedTryCatchDemo();
		nd.testNestedTry();
	}

}
