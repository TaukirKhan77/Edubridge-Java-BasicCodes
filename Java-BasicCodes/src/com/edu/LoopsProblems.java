package com.edu;

public class LoopsProblems {
	public static void main(String[] args) {
	int f1=0;
	int f2=1, f3;


	int t=5;


	System.out.println(f1);
	System.out.println(f2);


	for(int i=3;i<=t;i++){
	f3=f1+f2;
	System.out.println(f3);
	f1=f2;
	f2=f3;

	}


	}
}

