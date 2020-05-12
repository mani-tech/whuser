package com.nit.method;

import java.util.Scanner;

public class CubeAndSquare {
public static void SquareAndCube()
{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int a=sc.nextInt();
	System.out.println("The Square of a Number is "+a*a);
	System.out.println("The Cube of a Number is "+a*a*a);

}
	public static void main(String[] args) {
		SquareAndCube();
	}

}
