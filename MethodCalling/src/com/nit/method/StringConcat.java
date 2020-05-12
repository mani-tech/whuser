package com.nit.method;

import java.util.Scanner;

public class StringConcat {
public void StringConcatination() {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first name");
	String first=sc.next();
	System.out.println("Enter the second name");
	String second=sc.next();
	System.out.println("Hello Mr:"+first+second);

}
	public static void main(String[] args) {
		StringConcat stc=new StringConcat();
		stc.StringConcatination();
	}

}
