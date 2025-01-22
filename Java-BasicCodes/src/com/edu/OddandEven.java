package com.edu;
import java.util.Scanner;


public class OddandEven {


public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter your number:");
int n=sc.nextInt();
if(n%2==0) {
System.out.println(n+" is even number");
}
else {
System.out.println(n+" is odd number");
}
}


}