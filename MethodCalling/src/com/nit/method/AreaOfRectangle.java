package com.nit.method;

import java.util.Scanner;

public class AreaOfRectangle {
public void AreaAndPerimeterOfRectangle()
{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of Rectangle");
	int l=sc.nextInt();
	System.out.println("Enter the breadth of Rectangle");
	int b=sc.nextInt();
	System.out.println("The Area of Rectangle is "+l*b);
	System.out.println("The Perimeter of Rectangle is "+2*(l+b));
}
	public static void main(String[] args) {
		AreaOfRectangle ar=new AreaOfRectangle();
		ar.AreaAndPerimeterOfRectangle();
	}

}
