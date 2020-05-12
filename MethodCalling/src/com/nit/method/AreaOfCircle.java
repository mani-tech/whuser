package com.nit.method;

import java.util.Scanner;

public class AreaOfCircle {
public void AreaAndPerimeterOfCircle()
{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius");
	int r=sc.nextInt();
	System.out.println("The Area of Circle is "+3.14*r*r);
	System.out.println("Perimeter of circle is "+2*3.14*r);
}
	public static void main(String[] args) {
		AreaOfCircle ac=new AreaOfCircle();
		ac.AreaAndPerimeterOfCircle();
	}

}
