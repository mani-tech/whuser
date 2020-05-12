package com.nit.method;

public class SumOfDigits {
void m1(int val1)
{
int sum=0;
while(val1>0)
{
 sum=sum+val1%10;//1,2,3
val1=val1/10;//432,43,4
}
System.out.println(sum);
}
	public static void main(String[] args) {
		SumOfDigits t3=new SumOfDigits();
		t3.m1(5465);
	}

}
