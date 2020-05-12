package com.nit.method;

import java.util.Scanner;

public class Temperature {
public void celsiusToFahrenheit()
{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Celsius Temp");
	int c=sc.nextInt();
	System.out.println("The Fahrenheit temp is "+(((9%5)*c)+32));
}
public void fahrenheitToCelsius()
{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the fahrenheit Temp");
	int f=sc.nextInt();
	System.out.println("The Celsius temp is "+(5%9)*(f-32));
}
	public static void main(String[] args) {
		Temperature t=new Temperature();
		t.celsiusToFahrenheit();
		t.fahrenheitToCelsius();
	}

}
