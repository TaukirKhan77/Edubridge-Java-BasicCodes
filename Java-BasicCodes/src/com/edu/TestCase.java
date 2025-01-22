package com.edu;
import java.util.Scanner;
public class TestCase {
	  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	     
	System.out.print("Enter the number of units: ");
	int units = scanner.nextInt();
	     
	    double bill = calculateBill(units);
	System.out.println("The total electricity bill is: " + bill + " Rs");
	     
	scanner.close();
	  }
	   
	  public static double calculateBill(int units) {
	double bill = 0;
	     
	if (units <= 100) {
	bill = units * 2;
	} else if (units > 100 && units <= 200) {
	bill = (100 * 2) + ((units - 100) * 3);
	} else if (units > 200) {
	bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);
	    }
	     
	    return bill;
	  }
	}
}
