package com.edu;

public class MyCustomException extends Exception {
	public MyCustomException(String msg){//parameterize constructor
		super(msg);//refer immediate parent class constructor
	}

}
