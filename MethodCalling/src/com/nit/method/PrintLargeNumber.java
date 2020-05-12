package com.nit.method;

import java.util.Scanner;

public class PrintLargeNumber {
static void printNumber() {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	int a=sc.nextInt();
	System.out.println("Enter the second number");
	int b=sc.nextInt();
	if(a>b)
		System.out.println("The biggest Number is "+a);
	else
		System.out.println("The biggest Number is "+b);
}
	public static void main(String[] args) {
		printNumber();
	}

}
