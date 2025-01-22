package com.edu;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
	int	pos=0;
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("Enter the Array Elements");
System.out.println("Enter Key");
	int key=sc.nextInt();
	 for(int i=0;i<a.length;i++){
		 a[i]=sc.nextInt();
		if(a[i]==key){
		pos=i+1;
		break;
		}
		}
		if(pos>0){
		System.out.println("Successful search");
		System.out.println(key+" found at position "+pos);
		}
		else{
		System.out.println("Unsuccessful search");
		}

	}
}
