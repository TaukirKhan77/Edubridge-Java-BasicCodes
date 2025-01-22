package com.edu;
import java.util.Scanner;
public class Loop {
public static void main(String[] args) {
//	int i;
//	for(i=1;i<=5;i++){
//		System.out.println(i);
//	}
//	System.out.println(i);
	
	//Infinite For Loop
	// Problem 1
/*	int i;
	for(i=2;i<=100;i+=2) {
		System.out.println(i);
	}
*/
	//Problem 2
//  int sum = 0;

   //   for (int i = 1; i <= 100; i++) {
   //       sum += i;
   //   }

    //  System.out.println("The sum of numbers from 1 to 100 is: " + sum);
  
	//Problem 3
	Scanner sc = new Scanner(System.in);
    
  /*  System.out.print("Enter a number to find its factorial: ");
    double number = sc.nextInt();
    
    double factorial = 1;
    
    for (double i = 1; i <= number; i++) {
        factorial *= i;  // Multiply factorial by i in each iteration
    }
    
  System.out.println("The factorial of " + number + " is: " + factorial);
*/	
  System.out.print("Enter the number of terms for the Fibonacci series: ");
int terms = sc.nextInt();

int first = 0, second = 1;

System.out.println("Fibonacci Series up to " + terms + " terms:");

for (int i = 1; i <= terms; i++) {
    System.out.print(first + " ");
    
    // Update to next terms in series
    int next = first + second;
    first = second;
    second = next;
}

}
}


