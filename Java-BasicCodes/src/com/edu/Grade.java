package com.edu;
import java.util.Scanner;
public class Grade {
public static void main(String[] args) { 
	//use else if ladder
	/* 
	Marks(i/p) Grade(o/p)
	90-100 Grade A
	80-89 Grade B
	50-79 Grade C
	35-49 Grade D
	0 - 34 Grade E
	0>m>100 Invalid marks

	*/
	Scanner sc=new Scanner(System.in);
	int marks=sc.nextInt();
	  if (marks > 100 || marks < 0) {
          System.out.println("Invalid marks");
	  }
          else if(marks>=90 && marks<=100) {
		System.out.println("The Grade Is A");
	}else if(marks>=80 && marks<=89) {
		System.out.println("The Grade IS B");
	}else if(marks>=50 && marks<=79) {
		System.out.println("The Grade IS C");
	}else if(marks>=35 && marks<=49) {
		System.out.println("The Grade IS D");
	}else if(marks>=0 && marks<=34) {
		System.out.println("The Grade IS E");
}

}
}