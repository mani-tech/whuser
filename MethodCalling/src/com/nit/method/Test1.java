package com.nit.method;

public class Test1 {
void m1(boolean status)
{
	if(status)
	{
		System.out.println("input is valid");
	}
	else
	{
		System.out.println("input is invlid");
	}
}
	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.m1(true);
		t1.m1(false);
	}

}
