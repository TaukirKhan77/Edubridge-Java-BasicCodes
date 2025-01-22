package com.edu;
import java.util.Scanner;
public class AreaCalculator {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     
     System.out.println("Choose a figure to calculate area:");
     System.out.println("1. Circle\n2. Rectangle\n3. Triangle");
     int choice = sc.nextInt();

     switch (choice) {
         case 1:
             System.out.print("Enter radius of the circle: ");
             double radius = sc.nextDouble();
             double circleArea = Math.PI * radius * radius;
             System.out.println("Area of Circle: " + circleArea);
             break;
             
         case 2:
             System.out.print("Enter length and width of the rectangle: ");
             double length = sc.nextDouble();
             double width = sc.nextDouble();
             double rectangleArea = length * width;
             System.out.println("Area of Rectangle: " + rectangleArea);
             break;
             
         case 3:
             System.out.print("Enter base and height of the triangle: ");
             double base = sc.nextDouble();
             double height = sc.nextDouble();
             double triangleArea = 0.5 * base * height;
             System.out.println("Area of Triangle: " + triangleArea);
             break;
             
         default:
             System.out.println("Invalid choice");
     }
}
}
