package com.nit.method;

public class Test2 {
	static void m2(char color)
	{
		switch(color)
		{
		case 'R':
			System.out.println("color is Red");
			break;

		case 'G':
			System.out.println("color is Green");
			break;

		case 'B':
			System.out.println("color is Blue");
			break;
		default:
			System.out.println("color is not sure");
			break;
		} 
	}
	public static void main(String[] args) {
Test2.m2('A');
	}

}
