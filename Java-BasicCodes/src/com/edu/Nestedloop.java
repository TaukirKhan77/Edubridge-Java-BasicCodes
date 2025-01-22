package com.edu;

public class Nestedloop {
	public static void main(String[] args) {
	//Nested Loop
/*	for(int i=1;i<=3;i++) { //i=2
	//for(int j=1;j<=3;j++) {
	for(int j=1;j<=i;j++) {
	//System.out.println("i="+i +" and j="+j);
	//System.out.print(i+" ");
	//System.out.print(j+" ");
	System.out.print("* ");
	}
	System.out.println();
	}
*/	
		int r=3;

		for(int i=1;i<=r;i++) {
		for(int b=1;b<=r-i;b++) {
		System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
		System.out.print(i+" ");
		}
		System.out.println();
		}
		int r1=2;

		for(int i=1;i<=r1;i++) {
		for(int b=1;b<=r1-i;b++) {
		System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
		System.out.print(i+" ");
		}
		System.out.println();
		}
		int r2=4;

		for(int i=1;i<=r2;i++) {
		for(int b=1;b<=r2-i;b++) {
		System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
		System.out.print(i+" ");
		}
		System.out.println();
		}
		}
}
	
	
	



