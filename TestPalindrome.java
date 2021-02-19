package com.work.test;

public class TestPalindrome {
public static void main(String[] args) {
	int i=12345,sum=0,temp,r;
	temp=i;
	while(i>0)
	
	{
		r=i%10;
		sum=(sum*10)+r;
		i=i/10;
		
		}
	System.out.println("revers number"+sum);
	
//	if(temp==sum)
//{
//			System.out.println("The Palindrome");}
//		else 
//			{System.out.println("Not Palindrome");
	//		}
	
			}
}
