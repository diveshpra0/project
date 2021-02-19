package com.work.test;

public class TestpatternNo {
public static void main(String[] args) {
	int i=1;
	while(i<=5)
	{
	int	j=0;
		while(j<=i)
		{
			j=i+j;
			System.out.print("  "+j);
	
			j--;
		}
		System.out.println();
		i++;
	}
}
}
