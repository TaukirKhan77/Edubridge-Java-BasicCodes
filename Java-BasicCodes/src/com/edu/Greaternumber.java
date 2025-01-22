package com.edu;
import java.util.Scanner;
public class Greaternumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your First Number");
		int a=sc.nextInt();
		System.out.println("Enter The Second Number");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("The Largest of " +a + "  and " +b+ " is " + a);
		}else {
			System.out.println("The Largest of " +a + "  and " +b+ " is " + b);
		}
		
	}

}
