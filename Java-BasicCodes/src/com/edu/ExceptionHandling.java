package com.edu;

public class ExceptionHandling {
//
	void arithmeticDemo() {
		try {
			int no=100/0;
			System.out.println("no: "+no);
		}catch(ArithmeticException e){
			System.out.println(e);
		}
	//Rest of code
System.out.println("Its exception handling code");
	}
	//String does not have value Nullpointer Exception
	void StringLength() {
		try {
			String str=null;
			System.out.println("length of str :"+str.length());	
		}catch(NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("Emample of NullPointerException");
	}
	// ArrayIndexOutOfBoundsException
	void ArrayIndex() {
		try {
			int a[]=new int [5];
			a[10]=30; //ArrayIndexOutOfBoundsException
			System.out.println("a[10] : "+a);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	// ArrayIndexOutOfBoundsException with multiple catch
	void multipleCatch()throws ArithmeticException,ArrayIndexOutOfBoundsException{
		try {
			int a[]=new int[5];
			a[10]=20;//ArrayIndexOutOfBoundsException
			a[5]=30/0;//ArithmeticException
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}finally {
			//rest of code
			System.out.println("Execute rest of the code");
		}
	}
	public static void main(String[] args) {
		ExceptionHandling ed=new ExceptionHandling ();
		ed.arithmeticDemo();
	//	ed.StringLength();
		ed.ArrayIndex();
	//	ed.multipleCatch();
	}
}

