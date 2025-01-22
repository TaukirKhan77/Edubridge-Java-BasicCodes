package com.edu;
import java.util.Scanner;
public class OddandEvenSc {
	public static void main(String[] args) {
		
	  Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      int number = scanner.nextInt();

      switch (number % 2) {
          case 0:
              System.out.println(number + " is even.");
              break;
          case 1:
              System.out.println(number + " is odd.");
              break;
          default:
              System.out.println("Invalid input.");
      }
	}
}
