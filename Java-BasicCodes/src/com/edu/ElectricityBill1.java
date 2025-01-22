package com.edu;
import java.util.Scanner;
public class ElectricityBill1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter units consumed:");
	int unitsConsumed=sc.nextInt();
	int totalCharge=0;
	// System.out.println("Enter charge per Unit:");
	// int chargePerUnit=sc.nextInt();
	if(unitsConsumed<=100)
	totalCharge=unitsConsumed*2;
	else if(unitsConsumed<=200)
	totalCharge=200+(unitsConsumed-100)*3;
	else
	totalCharge=200+300+(unitsConsumed-300)*5;

	System.out.println("Total amount to be paid is "+totalCharge);
	}
	}


