package com.work.test;

public class TestPattern {
public static void main(String[] args) {
	int i=5;
	while(i>=1)
	{
	int	j=0;
		while(j<i)
		{
			System.out.print(" "+i);
			j++;
		}
		System.out.println();
		i--;
	}
}
}
