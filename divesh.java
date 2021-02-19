package com.work.test;

public class divesh {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		String a="Divesh Prajapat";
		String b="   Airplain   ";
		String c=b.trim();
		System.out.println(c);
		System.out.println(a.charAt(3));
		System.out.println(a.codePointAt(0));
		System.out.println(a.codePointBefore(2));
		System.out.println(a.length());
		System.out.println(b.indexOf("1"));
		System.out.println(b.toLowerCase());
		System.out.println(b.toUpperCase());
		System.out.println(a.startsWith("b"));
		System.out.println(a.substring(3));
		System.out.println(a.substring(0,3));
		System.out.println(a.toString());
		System.out.println(a.valueOf(7));
		System.out.println(b.subSequence(2, 7));
		System.out.println(a.replace("Divesh Prajapat","Rohit"));
		System.out.println(a.replaceAll("D","P"));
		System.out.println(a.toCharArray());
		System.out.println(b.hashCode());
		System.out.println(b.isEmpty());
		System.out.println(a.matches(b));
		// Array
//		int x [][]; // declaration
//		 
//		//Memory Allocation Or Initialization
//		x= new int [1][1];
//		// assign value
//		x [0] [0]=2;
//		x[0][1]=3;
		
		
		  
	}
}
