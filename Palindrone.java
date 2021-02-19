package com.work.test;

public class Palindrone {

	public static void main(String[] args) 
	{
	int n=153;
	int tem=n;
	int s=0;
	int r;
	
	while(tem>0)
	{
		r=tem%10;
		s=s+r*r*r;
		tem=tem/10;
	}
	if(s==n)
	{
//	System.out.println("it is pelindrone");	
	}
	else
	{
		System.out.println("it is not pelindrone");
	}
	
	}

}
