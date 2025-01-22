package com.edu;
import java.util.Scanner;
public class Largestofthreenumber {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter the value of num1: ");
	int num1 = scan.nextInt();

	System.out.println("Enter the value of num2: ");
	int num2 = scan.nextInt();

	System.out.println("Enter the value of num3: ");
	int num3 = scan.nextInt();

	if (num1 > num2 && num1 > num3) {
	System.out.println(""+num1+" is the largest number.");
	} else if (num2 > num3) {
	System.out.println(""+num2+" is the largest number.");
	} else {
	System.out.println(""+num3+" is the largest number");
	}

	}


	}

